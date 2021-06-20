package org.clb.designpattern.mediator_pattern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description
 * @Classname Mediator
 * @Date 2021/6/2 11:29
 * @Author clb
 */
public class Mediator  extends AbstractMediator{
    List<AbstractColleague> list=new LinkedList<>();
    @Override
    public void register(AbstractColleague colleague) {
        if (!list.contains(colleague)){
            list.add(colleague);
            colleague.setMedium(this);
        }
    }

    @Override
    public void relay(Colleague current) {
        for (AbstractColleague c : list) {
            if (current!=c){
                c.receive(current);
            }
        }
    }
}
