package org.clb;

import org.clb.pojo.Receive;
import org.clb.pojo.User;
import org.clb.util.age.DateCompare;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * @Description
 * @Classname Test222
 * @Date 2021/6/6 17:14
 * @Author clb
 */
public class Test222 {

    public static void main(String[] args) throws ParseException {
        //yyyy-MM-dd HH:mm:ss
//        List<String> list = Collections.singletonList("[{\n" + "    \"accountId\":\"" + "123" + "\",\n" + "}]");
//        List<String> list1=new ArrayList<>();
//        list.add("123");
//        StringBuffer msg=new StringBuffer();
//        System.out.println(msg.length()==0);
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
