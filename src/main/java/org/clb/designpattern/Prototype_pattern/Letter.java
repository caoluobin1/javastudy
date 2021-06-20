package org.clb.designpattern.Prototype_pattern;

/**
 * @Description
 * @Classname Letter
 * @Date 2021/5/31 15:40
 * @Author clb
 */
public class Letter implements Cloneable{
    String  msg;
    String toUser;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser;
    }

    public Letter(String msg, String toUser) {
        this.msg = msg;
        this.toUser = toUser;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public void show(){
        System.out.println("·¢ËÍ"+msg);
    }
}
