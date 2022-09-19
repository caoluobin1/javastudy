package org.clb.designpattern.visitor_pattren.visitor2;

public class FruitShop implements Shop{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getProduct() {
        return "Ë®¹û";
    }

}
