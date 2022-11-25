package org.clb;


import com.alibaba.fastjson.JSON;
import org.clb.pojo.User;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * @Description
 * @Classname Test222
 * @Date 2021/6/6 17:14
 * @Author clb
 */
public class Test222 {
    private static final Map map = new HashMap();
    private static final Integer b = 2;
    public static void main(String[] args) throws ParseException {
        map.put(null,"a");
        System.out.println(map.get(null));
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
