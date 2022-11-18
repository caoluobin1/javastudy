package org.clb.util.pattern;

import java.util.regex.Pattern;

public class PatternUtil {
    public static void main(String[] args) {
        test();
    }
    public static void test(){
        boolean matches = Pattern.matches("a [\\s\\S]* b", "c asd.asd b");
        System.out.println(matches);
    }
}
