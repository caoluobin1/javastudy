package org.clb.juc.thread.thread_pool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.clb.pojo.User;

/**
 * @Description
 * @Classname ThreadPoolExecutorTest
 * @Date 2021/5/21 9:16
 * @Author clb
 */
public class ThreadPoolExecutorTest {

    public static void main(String[] args) {
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

}
