package org.clb.designpattern.brige_pattern.newB;

public abstract class EarPhone {
    protected Connect connect;

    public EarPhone(Connect connect) {
        this.connect = connect;
    }
    public void con() {
        this.connect.con();
    }

    public abstract void brand();
}
