package org.clb.juc;

import org.clb.pojo.User;

import java.util.concurrent.Exchanger;

public class ExchangerTest {

    public static void main(String[] args) throws InterruptedException {
        test1();
    }

    public static void test1() throws InterruptedException {
        Exchanger<User> exchanger = new Exchanger();
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            new Thread(()->{
                try {
                    User userc=new User(finalI+"",finalI+"",finalI+"",finalI);
                    User exchange = exchanger.exchange(userc);
                    System.out.println("user:"+userc+"  ||   exchange"+exchange);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }).start();
        }
    }
}
