package org.clb.thread.thread_pool;

import lombok.Data;
import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.*;

public class MyThreadPool extends ThreadPoolExecutor {

    public static ThreadLocal<String> tokenThreadLocal = new ThreadLocal<>();
    public MyThreadPool(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
    }


    @Override
    protected void beforeExecute(Thread t, Runnable r) {
        super.beforeExecute(t, r);
        System.out.println("before");
        if (r instanceof MyFutureTask) {
            MyFutureTask futureTask = (MyFutureTask) r;
            String token = futureTask.getToken();
            System.out.println("获取token"+token);
            tokenThreadLocal.set(token);
        }else {
            try {
                Class<?> aClass = Class.forName("java.util.concurrent.CompletableFuture$AsyncSupply");
                if (r.getClass().equals(aClass)){
                    Field fn = r.getClass().getDeclaredField("fn");
                    fn.setAccessible(true);
                    if (fn!=null){
                        Object task = fn.get(r);
                        if (task instanceof MySupplierTask){
                            MySupplierTask futureTask = (MySupplierTask)task ;
                            String token = futureTask.getToken();
                            System.out.println("获取token"+token);
                            tokenThreadLocal.set(token);
                        }
                    }
                }
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

        }
    }

    @Override
    protected void afterExecute(Runnable r, Throwable t) {
        super.afterExecute(r, t);
        tokenThreadLocal.remove();
    }

    public <T> Future<T> submit(MyFutureTask task) {
        if (task == null) throw new NullPointerException();
        execute(task);
        return task;
    }

    public static void main(String[] args) {
        String token ="eyJhbGciOiJIUzUxMiJ9.eyJ0eXBlIjoxLCJleHAiOjE2NzM1NzY4NzksInVzZXJJZCI6NzMxODY5MTA1MzEyOTYwNTEyLCJhY2NvdW50TmFtZSI6ImNhb2x1b2JpbiIsImlhdCI6MTY3MDk4NDg3OSwib3JnSWQiOjYzOTUzNjczMTQ1MTExNzU3MX0.Dz8CjHPagg1X44Ie-4NyEdVUzcyVGjU6JOwmcb8wMKMsXI0oOKtjKLxCj39Gor5NItBrA6Y1w6P6izLDpT6JFA";
        MyThreadPool threadPool = new MyThreadPool(2, 4,
                0L, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<>(5));
//        Future<Object> future = threadPool.submit(new MyFutureTask(() -> {
//            String threadToken = threadPool.tokenThreadLocal.get();
//            System.out.println("threadToken==========================>" + threadToken);
//            ResultRes<List<EconomicSubEntity>> economicSubListAllData = userClient.getEconomicSubListAllData(2022);
//            System.out.println("result==============================> " + economicSubListAllData.toString());
//            return economicSubListAllData;
//        }, token));
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(new MySupplierTask(token,() -> {
            String threadToken = threadPool.tokenThreadLocal.get();
            System.out.println("threadToken==========================>" + threadToken);
            System.out.println("result==============================> ");
            return 10;
        }), threadPool);
    }

}
