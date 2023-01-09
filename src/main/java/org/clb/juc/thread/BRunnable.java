package org.clb.juc.thread;

import lombok.SneakyThrows;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BRunnable implements Runnable{
    @SneakyThrows
    @Override
    public void run() {

        synchronized (BRunnable.class){
            Thread.sleep(50);
            Thread.sleep(10);
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        long start =System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
//            executorService.submit(new ARunnable());
        }
        executorService.shutdown();
        while (!executorService.isTerminated()){

        }
        System.out.println(System.currentTimeMillis()-start);
    }
}
