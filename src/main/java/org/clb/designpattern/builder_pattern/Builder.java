package org.clb.designpattern.builder_pattern;

import lombok.AllArgsConstructor;

/**
 * @Description
 * @Classname Builder
 * @Date 2021/7/21 9:54
 * @Author clb
 */
@AllArgsConstructor
public class Builder extends  AbstractBuilder{
    private Product product;

    @Override
    public void buildProductA(String product) {
        this.product.setProductA(product);
    }

    @Override
    public void buildProductB(String product) {
        this.product.setProductB(product);
    }

    @Override
    public void buildProductC(String product) {
        this.product.setProductC(product);
    }
}
