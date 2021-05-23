package org.clb.designpattern.brige_pattern;

/**
 * @Description
 * @Classname HouseCorp
 * @Date 2021/5/18 14:06
 * @Author clb
 */
public class AppleCorp extends Corp {
  public AppleCorp() {
  }

  public AppleCorp(AppleProduct product) {
    super(product);
  }

  @Override
  public void make() {
    this.product.producted();
    this.product.selled();
    System.out.println("-------------");
  }
}
