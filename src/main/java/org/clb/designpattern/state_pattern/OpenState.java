package org.clb.designpattern.state_pattern;

/**
 * @Description
 * @Classname OpenState
 * @Date 2021/5/28 8:53
 * @Author clb
 */
public class OpenState extends State{

    @Override
    public void open() {
        System.out.println("¿ªÃÅ");
    }

    @Override
    public void close() {
        super.myContext.setState(MyContext.closeState);
        super.myContext.getState().close();
    }
}
