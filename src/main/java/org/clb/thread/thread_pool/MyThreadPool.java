package org.clb.thread.thread_pool;

import lombok.Data;
import lombok.SneakyThrows;

import java.lang.reflect.Field;
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
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
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

}
