package org.clb;


import java.text.ParseException;
import java.util.Map;

/**
 * @Description
 * @Classname Test222
 * @Date 2021/6/6 17:14
 * @Author clb
 */
public class Test222 {

    public static void main(String[] args) throws ParseException {
        for (int i = 0; i < 100; i++) {
            System.out.println((int) (Math.random() * 2) + 1);
        }
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
