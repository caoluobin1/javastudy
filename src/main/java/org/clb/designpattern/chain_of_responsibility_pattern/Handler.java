package org.clb.designpattern.chain_of_responsibility_pattern;

/**
 * @Description
 * @Classname Handler
 * @Date 2021/5/24 15:27
 * @Author clb
 */
public abstract class Handler {
    public Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }
    public abstract void handler(Boy b);
}
