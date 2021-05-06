package org.clb;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadExecutorTest {

    AtomicInteger a=new AtomicInteger(0);
    int b=0;
    /**
     * 使用线程池和CAS进行10000次a++
     */
    public void add(){
        a.getAndIncrement();
    }
    @Test
    public void test() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 100000; i++) {
            executorService.submit(()->{
                add();
            });
        }
        executorService.shutdown();
        Thread.sleep(1000);
        System.out.println(a.get());
    }
    @Test
    public void test2(){
        LinkedBlockingQueue l=new LinkedBlockingQueue();
        l.isEmpty();
    }
}
