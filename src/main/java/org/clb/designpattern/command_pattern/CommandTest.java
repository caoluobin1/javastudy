package org.clb.designpattern.command_pattern;

import org.clb.designpattern.command_pattern.oreder.BuyOrder;
import org.clb.designpattern.command_pattern.oreder.TakeOrder;
import org.clb.designpattern.command_pattern.stock.ShopStock;

/**
 * @Description
 * @Classname CommandTest
 * @Date 2021/5/18 14:50
 * @Author clb
 */
public class CommandTest {

  public static void main(String[] args) {
    TakeOrder takeOrder=new TakeOrder(new ShopStock());
    BuyOrder buyOrder=new BuyOrder(new ShopStock());
    Braker braker=new Braker();
    braker.addOrder(takeOrder);
    braker.addOrder(buyOrder);
    braker.executeOrders();
  }

}
