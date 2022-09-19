package org.clb.designpattern.visitor_pattren.visitor2;

public class VisitorTestA {
    public static void main(String[] args) {
        Shop fruitShop = new FruitShop();
        FruitShop fruitShop2 = new FruitShop();
        Visitor consumerVisitor = new ConsumerVisitor();
        Visitor dealerVisitor = new DealerVisitor();
        fruitShop.accept(consumerVisitor);
        fruitShop.accept(dealerVisitor);
        consumerVisitor.visit(fruitShop);
        consumerVisitor.visit(fruitShop2);


    }
}
