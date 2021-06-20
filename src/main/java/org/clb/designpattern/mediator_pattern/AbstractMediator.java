package org.clb.designpattern.mediator_pattern;

/**
 * @Description
 * @Classname AbstractMediator
 * @Date 2021/6/2 11:20
 * @Author clb
 */
public abstract class AbstractMediator {
    public abstract void register(AbstractColleague colleague);
    public abstract void relay(Colleague current);
}
