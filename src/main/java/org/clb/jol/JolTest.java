package org.clb.jol;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.vm.VM;

/**
 * @Description
 * @Classname JolTest
 * @Date 2023/1/20 21:15
 * @Author clb
 */
public class JolTest {
    public static void main(String[] args) {
        test4();
    }

    public static void test() {
        Object o = new Object();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
    }

    public static void test2() {
        System.out.println(VM.current().details());
    }

    public static void test3() {
        NoField o = new NoField();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
    }

    public static void test4() {
        HaveField o = new HaveField();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
    }

    static class NoField {

    }

    static class HaveField {
        int c;
        int a;
        boolean f = false;

    }
}
