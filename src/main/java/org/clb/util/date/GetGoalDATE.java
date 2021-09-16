package org.clb.util.date;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.clb.util.stringsplitter.SplitterUtil;

/**
 * @Description 日期操作类
 * @Classname GetGoalDATE
 * @Date 2021/5/10 14:56
 * @Author clb
 */
public class GetGoalDATE {

    public static String getGoaldate(String date, int a) {
        Calendar cal = Calendar.getInstance();
        List<String> list = split(date, "-");
        cal.set(Integer.parseInt(list.get(0)), Integer.parseInt(list.get(1)) - 1,
            Integer.parseInt(list.get(2)));
        Date time = cal.getTime();
        //System.out.println("当前指定日期是："+new SimpleDateFormat("yyyy-MM-dd").format(time));
        cal.add(Calendar.DAY_OF_MONTH, a);
        cal.getTime();
        //System.out.println("前两天的日期是 "+new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()));
        return new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
    }


    /**
     * 查看是否是最后一天
     *
     * @param a
     * @return
     */
    public static boolean nowIsLastDay(int a) {
        Calendar cal = Calendar.getInstance();
        int b = cal.getActualMaximum(a);
        int c = cal.get(a);
        //return true;
        return a == 7 ? cal.get(a) == 1 : b == c;
    }

    /**
     * @param date
     * @param a    往前几个月
     * @return
     */
    public static String getGoalMontLastDay(String date, int a) {
        Calendar cal = Calendar.getInstance();
        List<String> list = SplitterUtil.get(date, "-");
        cal.set(Integer.parseInt(list.get(0)), Integer.parseInt(list.get(1)) - 1,
            Integer.parseInt(list.get(2)));
        for (int i = 0; i < a; i++) {
            int day = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
            cal.add(Calendar.DAY_OF_MONTH, -day);
        }
        //System.out.println(cal.getTime());
        return new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
    }

    public static void main(String[] args) {
        //getGoaldate("2020-5-7",-10);
        //        boolean b = nowIsLastDay(Calendar.DAY_OF_MONTH);
        //        System.out.println(b);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String date = format.format(new Date());
        Calendar cal1 = Calendar.getInstance();
        int a = cal1.get(Calendar.DAY_OF_MONTH);
        System.out.println(GetLastMonthLastDay());

    }

    public static String GetLastMonthLastDay() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String date = format.format(new Date());
        Calendar cal1 = Calendar.getInstance();
        int a = -cal1.get(Calendar.DAY_OF_MONTH);
        Calendar cal = Calendar.getInstance();
        List<String> list = split(date, "-");
        cal.set(Integer.parseInt(list.get(0)), Integer.parseInt(list.get(1)) - 1,
            Integer.parseInt(list.get(2)));
        Date time = cal.getTime();
        //System.out.println("当前指定日期是："+new SimpleDateFormat("yyyy-MM-dd").format(time));
        cal.add(Calendar.DAY_OF_MONTH, a);
        cal.getTime();
        //System.out.println("前两天的日期是 "+new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()));
        return new SimpleDateFormat("yyyyMMdd").format(cal.getTime());
    }

    public static List<String> split(String a, String b) {
        String[] split = a.split(b);
        return Arrays.asList(split);
    }
}
