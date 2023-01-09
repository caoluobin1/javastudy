package org.clb.juc.thread.lock;

import org.clb.pojo.User;

import java.util.HashMap;
import java.util.Map;

public class LockTest {
    private  DefaultLockFactory factory=new DefaultLockFactory();
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            new Thread(()->{
                LockTest test = new LockTest();
                test.test();
            }).start();

        }

    }

    public void test(){
        Map<String,Integer> map=new HashMap<>();
        Lock lock=factory.getLock("nameLock");
        User user1=new User();
        User user2=new User();
        user1.setAge(0);
        user1.setName("user1");
        user2.setAge(0);
        user2.setName("user2");
        for (int i = 0; i < 1000; i++) {
            int finalI = i;
            new Thread(()->{
                int count = finalI % 2;
                try {
                    lock.lock(count+"");
                    User user = count==0?user1:user2;
                    map.put(count+"", user.getAge());
                    int age = user.getAge()+1;
                    Thread.sleep(1);
                    user.setAge(age);
//                    System.out.println(user.getName()+"=="+user.getAge());
//                    Thread.sleep(400);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                } finally {
                    lock.unlock(count+"");
                }
            }).start();
        }
        try {
            Thread.sleep(3000);
            System.out.println(map.get("1"));
            System.out.println(map.get("0"));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
