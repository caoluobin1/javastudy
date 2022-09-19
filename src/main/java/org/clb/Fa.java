package org.clb;

import lombok.Data;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.List;

@Data
public class Fa implements Acc<List>{
    private BigDecimal usedAmount;
    @Override
    public void say(List a) {
    }

    @Override
    public void sa(List a) {

    }

    public static void main(String[] args) {
        try {
            Method say = Acc.class.getDeclaredMethod("say", Object.class);
            System.out.println(say.isBridge());//false
            Method say3 = Fa.class.getDeclaredMethod("say", Object.class);
            System.out.println(say3.isBridge());//true
            Method say4 = Fa.class.getDeclaredMethod("say", List.class);
            System.out.println(say4.isBridge());//false
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
