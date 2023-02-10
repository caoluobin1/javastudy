package org.clb.juc.thread.threadLocal;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandomTest {

    public String  name;


    public static void main(String[] args) {
        LinkedHashSet<Object> set = new LinkedHashSet<>();
        set.add(16);
        set.add(13);
        set.add(14);
        Iterator<Object> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void test1() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        Random random1 = new Random();
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                int nextInt = random.nextInt();
                int nextInt2 = random1.nextInt();
                System.out.println("ThreadLocalRandom====>"+nextInt);
                System.out.println("random====>"+nextInt2);
            }).start();
        }
        System.out.println("ThreadLocalRandom====>"+random.nextInt());
        System.out.println("random====>"+random1.nextInt());


    }
}
