package org.clb;

import org.checkerframework.checker.units.qual.C;
import org.clb.pojo.PortalErr;
import org.clb.pojo.User;
import org.clb.pojo.list.Node;
import org.clb.util.age.GetGoalDATE;
import org.clb.util.stringsplitter.SplitterUtil;
import org.junit.Test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description
 * @Classname NormalTest
 * @Date 2021/5/9 13:40
 * @Author clb
 */
public class NormalTest {
    @Test
    public void test(){
        Node node=new Node();
        Node head=new Node();
        Node cur=node;
        cur=head;
        System.out.println(node);
        System.out.println(head);
        System.out.println(cur);
    }

    @Test
    public void test1(){
        Integer a=new Integer(1);
        Integer b=new Integer(1);
        System.out.println(a==b);
        System.out.println(a.equals(b));
        int c=2;
        int d=2;
        System.out.println(c==d);


    }
    @Test
    public void test2(){
        Calendar now = Calendar.getInstance();
        Object[] o=new Object[]{"asd","gfdds",now.get(Calendar.MONTH)+1};
        System.out.println(Arrays.asList(o));
        System.out.println(now.get(Calendar.YEAR)+" "+now.get(Calendar.MONTH)+1+" "+now.get(Calendar.DAY_OF_MONTH));
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String parse = format.format(new Date());
            System.out.println(parse);

    }
    @Test
    public void test3(){
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        for (int i = 0; i < 10; i++) {
            try {
                int a=i;
                if (i==5) a=4/0;
                System.out.println(a);
            }catch (Exception e){
                System.out.println("³ö´íÁË");
                throw e;
            }
        }

    }


    @Test
    public void test4(){
        List<Double> list=new ArrayList<>();
        double a=1;
        list.add(a);
        list.add(2.0);
        list.add(3.0);
//        list.add("4");
//        list.add("5");
        double sum = list.stream().mapToDouble(Double::doubleValue).sum();
        System.out.println(sum);

    }
    @Test
    public void test5(){
        Calendar cal=Calendar.getInstance();
        cal.set(2021,1,1);
        //cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
    @Test
    public void test6(){
        Object[] objects = SplitterUtil.get("33,33 ,33", ",").toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.print(objects[i]);
        }
        Map map=new HashMap();
        map.put("aa","da");
        System.out.println(map.get("aa"));

    }
    @Test
    public void test7(){
        GetGoalDATE.nowIsLastDay(Calendar.DAY_OF_WEEK);
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        cal.set(2021,4,16);
        int i = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(i);
    }
    @Test
    public void test8(){
        String goalMontLastDay = GetGoalDATE.getGoalMontLastDay("2020-05-31", 3);
        System.out.println(goalMontLastDay);
        List<PortalErr> list=new ArrayList<>();
        list.add(new PortalErr(10.1,"1"));
        list.add(new PortalErr(10.1,"2"));
        List<String> collect = list.stream().map(a -> a.getPk_portal_err()).collect(Collectors.toList());
        HashMap map=new HashMap();
        map.put("a",collect);
        System.out.println("sad");
    }

    @Test
    public void test9(){
        Calendar cal= Calendar.getInstance();
        int day_of_week = cal.get(Calendar.DAY_OF_WEEK);
        int day_of_month = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(day_of_month);
        String date=new SimpleDateFormat("yyyy-MM-dd").format(new Date());

        String da=day_of_month==cal.getActualMaximum(Calendar.DAY_OF_MONTH)?date:GetGoalDATE.getGoaldate(date,-day_of_month);
        String goalMontLastDay = GetGoalDATE.getGoalMontLastDay(da, 1);
        System.out.println(goalMontLastDay);
    }
    @Test
    public void test10(){
        Calendar cal= Calendar.getInstance();
        int day_of_week = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(day_of_week);
        String date=new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String weekDate=day_of_week==7?date:GetGoalDATE.getGoaldate(date,-day_of_week+1);
        String goaldate = GetGoalDATE.getGoaldate(weekDate, -7);
        System.out.println(weekDate);
        System.out.println(goaldate);
    }
    @Test
    public void test11(){
        List<Double> list=new ArrayList();
        list.add(5.2);
        list.add(3.2);
        list.add(10.2);
        list.add(12.2);
        list.add(11.2);
        List item_value =
            list.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(item_value.get(1));

    }
}
