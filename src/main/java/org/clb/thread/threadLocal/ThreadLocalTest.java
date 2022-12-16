package org.clb.thread.threadLocal;

public class ThreadLocalTest {

    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        System.out.println(0x61c88647*1);
        System.out.println(0x61c88647*2);
        System.out.println(0x61c88647*3);

    }
}
