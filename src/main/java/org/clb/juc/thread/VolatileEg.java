package org.clb.juc.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileEg implements Runnable{

    private static AtomicInteger count =new AtomicInteger(0);
    @Override
    public void run() {
        count.getAndIncrement();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            new Thread(new VolatileEg()).start();
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(VolatileEg.count);
    }
}
