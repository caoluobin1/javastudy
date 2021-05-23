package org.clb.designpattern.command_pattern.oreder;

import org.clb.designpattern.command_pattern.stock.ShopStock;

/**
 * @Description
 * @Classname BuyOrder
 * @Date 2021/5/18 14:38
 * @Author clb
 */
public class BuyOrder implements Order {
  public ShopStock stock;

  public BuyOrder(ShopStock stock) {
    this.stock = stock;
  }

  @Override
  public void execute() {
    this.stock.buy();
  }
}
