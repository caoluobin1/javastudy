package org.clb.designpattern.visitor_pattren.visitor1;

/**
 * @Description
 * @Classname VisitorTest
 * @Date 2021/5/25 10:30
 * @Author clb
 */
public class VisitorTest {

    public static void main(String[] args) {
        VisitorA a=new VisitorA();
        VisitorB b=new VisitorB();
        ShopA shopA=new ShopA();
        ShopB shopB=new ShopB();
        shopA.accept(a);
        shopB.accept(b);
    }

}
