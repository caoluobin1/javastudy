package org.clb.juc.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {

    private static AtomicInteger nextHashCode =
            new AtomicInteger();

    public static void main(String[] args) {
        System.out.println(nextHashCode.getAndAdd(0x61c88647)&31);
    }


}
