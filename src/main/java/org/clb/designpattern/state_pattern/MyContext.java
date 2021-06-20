package org.clb.designpattern.state_pattern;

/**
 * @Description
 * @Classname MyContenxt
 * @Date 2021/5/27 13:50
 * @Author clb
 */
public  class MyContext {
    public static final OpenState openState=new OpenState();
    public static final CloseState closeState=new CloseState();
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        this.state.setMyContext(this);
    }
}
