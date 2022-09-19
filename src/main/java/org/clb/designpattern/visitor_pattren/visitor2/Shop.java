package org.clb.designpattern.visitor_pattren.visitor2;

public interface Shop {
    public void accept(Visitor visitor);
    public String getProduct();
}
