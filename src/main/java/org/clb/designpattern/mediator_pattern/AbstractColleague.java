package org.clb.designpattern.mediator_pattern;

/**
 * @Description
 * @Classname AbstractColleague
 * @Date 2021/6/2 11:27
 * @Author clb
 */
public abstract class AbstractColleague {
    public Mediator mediator;
    public String msg;
    public void setMedium(Mediator mediator){
        this.mediator=mediator;
    }
    public abstract void send(String msg);
    public abstract void receive(Colleague current);
}
