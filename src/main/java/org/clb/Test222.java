package org.clb;


import com.alibaba.fastjson.JSON;
import org.clb.pojo.User;
import org.clb.pojo.list.Node;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/**
 * @Description
 * @Classname Test222
 * @Date 2021/6/6 17:14
 * @Author clb
 */
public class Test222 extends Thread{


    // 1 1
    // 1 2
    // 2 3
    // 3 5
    // 5 8
    class Node {
        String value;
        Map<String,Node> map = new HashMap<>();
    }

    public void nodeTest() {
        String[] subs = {"1","101","10101","10102","2","202","201","20101"};
        String[] target = {"10101","202"};

        for (String value : target) {

            for (int i = 0; i < value.length(); i++) {
                String a = value.substring(i, i + 1);
                Node node = new Node();
            }
        }

    }
    @Override
    public void run() {
        super.run();
        System.out.println("cccc"+Thread.currentThread().getName());
    }

    public Test222(Runnable target) {
        super(target);
    }

    private static final Map map = new HashMap();
    private static final Map map2 = new ConcurrentHashMap();
    private static final Map map3 = new Hashtable();
    private static final Integer b = 2;
    public static void main(String[] args) throws Exception {

        List<User> list =new ArrayList<>(5);
        list.add(new User());
        list.add(new User());
        list.add(new User());
        list.add(new User());
        list.add(new User());
        list.add(new User());
        AtomicReference<Integer> index = new AtomicReference<>(1);
        list.forEach(a->a.setAge(index.getAndSet(index.get() + 1)));
        index.set(1);
        list.forEach(System.out::println);
//        Test222 test222 = new Test222(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("aaa"+Thread.currentThread().getName());
//            }
//        });
//        test222.start();
//        String a="12345";
//        a=a.length()>5?a.substring(0,5):a;
//        System.out.println(a);
//        ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(()->1);
//        String no = "005";
//        System.out.println(String.format("%02d", 12));
//        System.out.println(Pattern.matches("\\d{4}", "005"));
//        System.out.println(-111>>>2);
//        System.out.println(Pattern.matches("\\d+.\\d+", "1111.55555"));

//        User user=new User();
//        user.setName("aa");
//        deal(user);
//        System.out.println(user.getName());
//        System.out.println(Thread.currentThread().isDaemon());
//        new Thread(()->{
//            try {
//                System.out.println(Thread.currentThread().isDaemon());
//                Thread.sleep(5000);
//                System.out.println("˯");
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }).start();
    }
    public static void mapTest(){
        long start = System.currentTimeMillis();
        int a=999999;
        for (int i = 0; i < a; i++) {
            map.put(i+"caa","aaa");
        }
        System.out.println("HashMap-put:"+(System.currentTimeMillis()-start));
        start = System.currentTimeMillis();
        for (int i = 0; i < a; i++) {
            map.get(i+"caa");
        }
        System.out.println("HashMap-get:"+(System.currentTimeMillis()-start));
        start = System.currentTimeMillis();
        for (int i = 0; i < a; i++) {
            map2.put(i+"caa","aaa");
        }
        System.out.println("ConcurrentHashMap-put:"+(System.currentTimeMillis()-start));
        start = System.currentTimeMillis();
        for (int i = 0; i < a; i++) {
            map2.get(i+"caa");
        }
        System.out.println("ConcurrentHashMap-get:"+(System.currentTimeMillis()-start));
        start = System.currentTimeMillis();
        for (int i = 0; i < a; i++) {
            map3.put(i+"caa","aaa");
        }
        System.out.println("Hashtable-put:"+(System.currentTimeMillis()-start));
        start = System.currentTimeMillis();
        for (int i = 0; i < a; i++) {
            map3.get(i+"caa");
        }
        System.out.println("Hashtable-get:"+(System.currentTimeMillis()-start));
    }
    public static void deal(User user){
        user.setName("bb");
    }
    //        String year = datetime.substring(0,4);
    //        String month = datetime.substring(0,7);
    //        String date = datetime.substring(0,10);
    //        System.out.println(year);
    //        System.out.println(month);
    //        System.out.println(date);
    public static void a(Map<String, Object> map) {
        map.put("status", (Integer) map.get("status") + 1);
    }

}
