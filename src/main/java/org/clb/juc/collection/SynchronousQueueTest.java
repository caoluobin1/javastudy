package org.clb.juc.collection;

import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueTest {
    private static SynchronousQueue queue = new SynchronousQueue();

    public static void main(String[] args) throws InterruptedException {
        test1();
    }
    public static void test1() throws InterruptedException {
        new Thread(() ->{
            try {
                queue.put(10);
                queue.put(9);
                queue.put(8);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }).start();

        new Thread(() ->{
            try {
                System.out.println(queue.take());
                System.out.println(queue.take());
                System.out.println(queue.take());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }).start();

    }
}
