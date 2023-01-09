package org.clb.juc.thread.threadLocal;

import java.util.concurrent.TimeUnit;

public class ThreadLocalTest {
    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            threadLocal.set(10);
            System.gc();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(threadLocal.get());
        }).start();
        TimeUnit.SECONDS.sleep(5);
    }

    public static void test1() {
        System.out.println(0x61c88647*1);
        System.out.println(0x61c88647*2);
        System.out.println(0x61c88647*3);

    }
}
