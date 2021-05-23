package org.clb.designpattern.brige_pattern;

/**
 * @Description
 * @Classname CopyCorp
 * @Date 2021/5/18 14:16
 * @Author clb
 */
public class CopyCorp extends Corp{

  public CopyCorp() {
  }

  public CopyCorp(Product product) {
    super(product);
  }

  @Override
  public void make() {
    this.product.producted();
    this.product.selled();
    System.out.println("-------------");
  }
}
