package org.clb.juc.aqs;

import java.util.concurrent.BrokenBarrierException;

public class CyclicBarrierTest {

    public static void main(String[] args) {
        test2();
    }

    public static void test1(){

        Cyclic cyclicBarrier=new Cyclic(3);
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            new Thread(()->{
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (BrokenBarrierException e) {
                    throw new RuntimeException(e);
                }
            },"thread"+i).start();
        }

    }
    public static void test2(){

        Cyclic cyclicBarrier=new Cyclic(3);

        new Thread(()->{
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
        }).start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        cyclicBarrier.lock.lock();
        System.out.println("aaaa");

    }
}
