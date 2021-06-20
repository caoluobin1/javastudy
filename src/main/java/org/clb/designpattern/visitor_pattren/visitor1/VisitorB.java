package org.clb.designpattern.visitor_pattren.visitor1;

/**
 * @Description
 * @Classname Visitor
 * @Date 2021/5/24 16:28
 * @Author clb
 */
public class VisitorB implements Visitor{
    public void visitA(ShopA a){
        a.operate();
    };
    public void visitB(ShopB b){
        b.operate();
    }

}
