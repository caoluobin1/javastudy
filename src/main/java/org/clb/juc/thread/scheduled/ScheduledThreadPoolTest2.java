package org.clb.juc.thread.scheduled;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Description
 * @Classname ScheduledThreadPoolTest
 * @Date 2021/5/30 21:15
 * @Author clb
 */
public class ScheduledThreadPoolTest2 {
    public static void main(String[] args) {
        Executor executor=Executors.newFixedThreadPool(16);
        ScheduledExecutorService schduledexecutor= Executors.newScheduledThreadPool(1);
        schduledexecutor.schedule(()-> {
            executor.execute(() -> {
                System.out.println("aa");
            });
        },2,TimeUnit.SECONDS);

    }
}
