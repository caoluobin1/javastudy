package org.clb.util;

import java.util.ArrayList;
import java.util.List;

public class BaseUtils {

    public static void main(String[] args) {
        System.out.println(List.class.isAssignableFrom(ArrayList.class));
    }
    public static boolean isBase(Class c) {
        if (long.class.equals(c)||Long.class.equals(c)
                ||int.class.equals(c)||Integer.class.equals(c)
                ||short.class.equals(c)||Short.class.equals(c)
                ||char.class.equals(c)||Character.class.equals(c)
                ||byte.class.equals(c)||Byte.class.equals(c)
                || boolean.class.equals(c)|| Boolean.class.equals(c)
                ||float.class.equals(c)
                ||double.class.equals(c)) {
            return true;
        }
        return false;
    }
}
