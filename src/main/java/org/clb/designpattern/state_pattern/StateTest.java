package org.clb.designpattern.state_pattern;




/**
 * @Description
 * @Classname StateTest
 * @Date 2021/5/28 9:50
 * @Author clb
 */
public class StateTest {

    public static void main(String[] args) {
        MyContext myContext = new MyContext();
        myContext.setState(new OpenState());
        myContext.getState().open();
        myContext.getState().close();


    }

}
