package org.clb.util.date;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @Description
 * @Classname GetNowYearDate
 * @Date 2021/8/9 16:05
 * @Author clb
 */
public class GetNowYearDate {
    public static List<String> getDateListThisYear() {
        Date nowDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(nowDate);
        int count = 365;
        int year = calendar.get(Calendar.YEAR);
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            count = 366;
        }
        List<String> dateList = new ArrayList<>();
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        int nowDayOfYear=calendar.get(Calendar.DAY_OF_YEAR);
        for (int i = 1; i < count+1; i++) {
            calendar.add(Calendar.DATE, i - nowDayOfYear);
            Date date = calendar.getTime();
            dateList.add(format.format(date));
            calendar.add(Calendar.DATE, nowDayOfYear - i);
        }
        return dateList;
    }

    public static void main(String[] args) {
        for (String s : getDateListThisYear()) {
            System.out.println(s);
        }
    }
}
