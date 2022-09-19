package org.clb.designpattern.brige_pattern.newB;

public class AirPods extends EarPhone{
    public AirPods(Connect connect) {
        super(connect);
    }
    @Override
    public void brand() {
        System.out.println("apple");
    }
}
