package org.clb.juc.atomic;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * @Description
 * @Classname AtomicIntegerFieldUpdaterTest
 * @Date 2022/12/7 22:43
 * @Author clb
 */
public class AtomicIntegerFieldUpdaterTest {

    public static void main(String[] args) throws InterruptedException {
        AIFUTest aifuTest = new AIFUTest();
        CountDownLatch count = new CountDownLatch(50);
        for (int i = 0; i < 50; i++) {
            new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    aifuTest.add(aifuTest);
                }
                count.countDown();
            }).start();
        }
        count.await();
        System.out.println(aifuTest.a);
    }

    static class AIFUTest {
        public volatile int a;
        AtomicIntegerFieldUpdater updater = AtomicIntegerFieldUpdater.newUpdater(AIFUTest.class, "a");

        public void add(AIFUTest aifuTest) {

            updater.getAndAdd(aifuTest, 1);
        }
    }


}
