package org.clb.juc.aqs;

import java.util.Map;

public class ConditionTest {


    public static void main(String[] args) {
        String a= "123456";
        System.out.println(a.substring(0,2));
        System.out.println(a.substring(2,a.length()));
    }

    public static void set(Map map){
    }
}
