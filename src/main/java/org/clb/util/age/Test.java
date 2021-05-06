package org.clb.util.age;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        A a=new A();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date bithday = format.parse("1994-05-05 17:20:20");
        System.out.println(a.calculate(bithday));
    }
}
