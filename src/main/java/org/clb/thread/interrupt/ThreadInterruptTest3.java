package org.clb.thread.interrupt;

import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadInterruptTest3 {
    public static void main(String[] args) {
        ReentrantLock lock=new ReentrantLock();
        Thread thread = new Thread(() -> {
            try {
                lock.lock();
                System.out.println("threadLock");
                LockSupport.park(Thread.currentThread());
                System.out.println("aa"+Thread.interrupted());
            } finally {
                lock.unlock();
            }

        });
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("mainThreadLock");
//        lock.lock();
        thread.interrupt();
//        LockSupport.unpark(thread);
    }
}
