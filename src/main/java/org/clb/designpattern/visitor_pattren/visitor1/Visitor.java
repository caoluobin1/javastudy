package org.clb.designpattern.visitor_pattren.visitor1;

/**
 * @Description
 * @Classname Visitor
 * @Date 2021/5/24 16:28
 * @Author clb
 */
public interface Visitor {
    public void visitA(ShopA a);
    public void visitB(ShopB b);

}
