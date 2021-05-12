package org.clb.pojo.list;

public class DoubleNode {
    public int data;
    public DoubleNode pre;
    public DoubleNode next;

    public DoubleNode() {
    }

    public DoubleNode(int data, DoubleNode pre) {
        this.data = data;
        this.pre = pre;
    }

    public DoubleNode(int data, DoubleNode pre, DoubleNode next) {
        this.data = data;
        this.pre = pre;
        this.next = next;
    }
}
