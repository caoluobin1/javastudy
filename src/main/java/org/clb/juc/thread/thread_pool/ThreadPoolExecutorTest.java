package org.clb.juc.thread.thread_pool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.clb.pojo.User;

/**
 * @Description
 * @Classname ThreadPoolExecutorTest
 * @Date 2021/5/21 9:16
 * @Author clb
 */
public class ThreadPoolExecutorTest {

    public static void main(String[] args) {
        poolSizeTest();


    }
    public static void test() {
        ExecutorService executorService = Executors.newFixedThreadPool(16);
        List<User> list=new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(new User(i+"","李"+i,"aaa",(int)(Math.random()*i)));
        }
        for (int i = 0; i < 1000; i++) {
            User user = list.get(i);
            int finalI = i;
            executorService.execute(()->{
                if (finalI <50){
                    System.out.println("加急马力操作中......进度"+finalI+"/1000");
                }
                user.setName(user.getName()+"蛋");
            });
        }
        executorService.shutdown();
        while (!executorService.isTerminated()){

        }
        for (int i = 0; i < 50; i++) {
            System.out.println(list.get(i).getName());
        }
    }

    public static void shutDownNowTest() {
        ExecutorService executorService = Executors.newFixedThreadPool(8);
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            executorService.submit(()->{
                System.out.println(finalI);
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        List<Runnable> runnables = executorService.shutdownNow();
        System.out.println("未完成数量"+runnables.size());
    }

    public static void poolSizeTest() {
        MyThreadPool threadPool = MyThreadPool.getInstance();
        for (int i = 0; i < 10; i++) {
            threadPool.submit(()->{
                try {
                    System.out.println("开始睡眠");
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        threadPool.shutdown();
    }

}
