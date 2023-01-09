package org.clb.juc.thread;

import java.util.concurrent.ExecutionException;

/**
 * @Description
 * @Classname RunableFutureTest
 * @Date 2021/6/7 15:18
 * @Author clb
 */
public class RunableFutureTest {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //        User user = new User("5", "cao", "b", 12);
        //        RunnableFuture future = new FutureTask(() -> {
        //            user.setAge(15);
        //            System.out.println(user.getAge());
        //        }, user);
        //        new Thread(future).start();
        //        Thread.sleep(2000);
        //        System.out.println(future.get());
        ThreadLocal t = new ThreadLocal();
        t.set("a");
        t.set("b");
        System.out.println(t.get());

    }

}
