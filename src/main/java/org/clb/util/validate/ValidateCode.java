package org.clb.util.validate;

/**
 * @Description
 * @Classname ValidateCode
 * @Date 2021/6/6 11:18
 * @Author clb
 */
public class ValidateCode {
    public static String getcode(int a ){
        String code =String.valueOf((int) ((Math.random() * 9 + 1) * Math.pow(10,a-1)));
        return code;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(getcode(5));
        }
    }
}
