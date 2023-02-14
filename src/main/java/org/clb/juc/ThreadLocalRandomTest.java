package org.clb.juc;

import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;

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
//                System.out.println(current.nextInt());
            }).start();
        }
        TimeUnit.SECONDS.sleep(1);
        System.out.println("==========================================");
        for (int i = 0; i < 10; i++) {
            new Thread(() ->{
                ThreadLocalRandom localRandom = ThreadLocalRandom.current();
                MetaObject ra = SystemMetaObject.forObject(localRandom);
                System.out.println(ra.getValue("seed"));
                System.out.println(localRandom.nextInt());
            }).start();
        }
    }
}
