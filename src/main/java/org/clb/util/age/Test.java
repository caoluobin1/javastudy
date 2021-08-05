package org.clb.util.age;

import org.clb.pojo.Receive;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test {
    public static void main(String[] args) throws ParseException {
        A a=new A();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date1 = format.parse("2021-07-03 12:11:05");
//        Date date2 = format.parse("2021-07-02 12:11:05");
//        List<Receive> list=new ArrayList<>();
//        list.add(new Receive("a","1","2021-07-03 12:11:05","1"));
//        list.add(new Receive("b","2","2021-07-01 12:11:05","2"));
//        list.stream().sorted(Comparator.comparing(Receive::getCreateTime).reversed()).forEach(System.out::println);
        String date = format.format(new Date());
        String goaldate = GetGoalDATE.getGoaldate(date, -30);
        System.out.println(goaldate);
    }
}
