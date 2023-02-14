package org.clb.juc;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class ThreadLocalRandomTest {
    public static void main(String[] args) throws InterruptedException {
        test1();
    }

    public static void test1() throws InterruptedException {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        for (int i = 0; i < 10; i++) {
            TimeUnit.SECONDS.sleep(1);
            new Thread(() ->{
                System.out.println(current.nextInt());
                System.out.println(current.nextInt());
            }).start();
        }
        TimeUnit.SECONDS.sleep(1);
        System.out.println("==========================================");
        for (int i = 0; i < 10; i++) {
            new Thread(() ->{
                System.out.println(ThreadLocalRandom.current().nextInt());
            }).start();
        }
    }
}
