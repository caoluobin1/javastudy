package org.clb.thread.thread_pool;

import lombok.Data;
import lombok.SneakyThrows;

import java.util.concurrent.*;

public class MyThreadPool extends ThreadPoolExecutor {
    public MyThreadPool(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
    }


    @Override
    protected void beforeExecute(Thread t, Runnable r) {
        super.beforeExecute(t, r);
        System.out.println("before");
        if (r instanceof FutureTask) {
            FutureTask futureTask =(FutureTask)r;
        }
    }

    @Data
    abstract static class TokenRunnable implements Runnable{
        private String token;

        public TokenRunnable(String token) {
            this.token = token;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThreadPool threadPool = new MyThreadPool(1, 2,
                0L, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<>(5));
        threadPool.submit(new TokenRunnable("5555") {
            @SneakyThrows
            @Override
            public void run() {
                System.out.println("开始执行1");
                TimeUnit.SECONDS.sleep(5);
                System.out.println("开始执行2");
                int c = 1/0;
                System.out.println("开始执行3");
            }
        });
        threadPool.shutdown();
        while (!threadPool.isTerminated()){
            TimeUnit.SECONDS.sleep(1);
            System.out.println("旋转跳跃");
        }
        System.out.println(1/0);
    }
}
