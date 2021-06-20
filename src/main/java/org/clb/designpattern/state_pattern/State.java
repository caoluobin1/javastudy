package org.clb.designpattern.state_pattern;

/**
 * @Description
 * @Classname State
 * @Date 2021/5/27 13:49
 * @Author clb
 */
public abstract class State {
    public MyContext myContext;

    public void setMyContext(MyContext myContext) {
        this.myContext = myContext;
    }
    public abstract void open();
    public abstract void close();

}
