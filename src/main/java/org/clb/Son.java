package org.clb;

import lombok.Data;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;

@Data
public class Son extends Fa{
    private BigDecimal budgetAmount;
    private ArrayList ab;



    public void ay(){

    }


    public static void main(String[] args) {
        try {
            Method say = Son.class.getDeclaredMethod("ay");
            System.out.println(say.isBridge());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
