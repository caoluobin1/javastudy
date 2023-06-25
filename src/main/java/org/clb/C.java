package org.clb;

import lombok.Data;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Data
public class C  extends D{
    private int a;


    public static void main(String[] args) {

        out:
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                if (i==3){
                    System.out.println("aaaa");
                    continue out;
                }

                System.out.println(i+"========"+j);
            }
        }
    }


}
