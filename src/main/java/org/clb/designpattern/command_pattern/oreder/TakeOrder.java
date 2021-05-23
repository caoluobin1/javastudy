package org.clb.designpattern.command_pattern.oreder;

import org.clb.designpattern.command_pattern.stock.ShopStock;

/**
 * @Description
 * @Classname TakeOrder
 * @Date 2021/5/18 14:47
 * @Author clb
 */
public class TakeOrder implements Order {
  public ShopStock stock;

  public TakeOrder(ShopStock stock) {
    this.stock = stock;
  }

  @Override
  public void execute() {
    this.stock.take();
  }
}
