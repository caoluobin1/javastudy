package org.clb.util.age;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        A a=new A();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date bithday = format.parse("1994-05-05 17:20:20");
        System.out.println(a.calculate(bithday));
        Calendar cal = Calendar.getInstance();
        int b = cal.get(Calendar.DAY_OF_MONTH);
        cal.add(Calendar.DAY_OF_MONTH,-b+1);
        System.out.println(format.format(cal.getTime()));

    }
}
