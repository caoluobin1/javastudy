package org.clb;

import org.junit.Test;

public class MathTest {
    @Test
    public void test(){
        for (int i = 0; i < 1000; i++) {
            int a=(int)(Math.random()*10) +1;
             System.out.println(a);
        }
    }
    @Test
    public void test2(){
        for (int i = 0; i < 100; i++) {
            int c=(int)(Math.random()*10)+1;
            if (c==0)
            System.out.println();
        }
    }
    @Test
    public void test3(){
        System.out.println(15&(-15));
    }
//    6 6 6 6 6 9 9 9 8 8 8 8 8 8 8 8 2 2 2 2 eor=:15
//    eor2=1
//
//            15:0
    //1001 0110
}
