package org.clb;

import org.junit.Test;

public class ThreadTest {
    static  int a=0;
    @Test
    public void test() throws InterruptedException {
        for (int i = 0; i < 100000; i++) {
            new Thread(()->{
                a++;
            }).start();
        }
        Thread.sleep(1000);
        System.out.println(a);
    }
}
