package org.clb.designpattern.observer_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Classname OberverList
 * @Date 2021/5/24 11:49
 * @Author clb
 */
public abstract class OberverList {
    List<Observer> list=new ArrayList<>();
    public void add(Observer o){
        list.add(o);
    }
    public void remove(Observer o){
        list.remove(o);
    }
    public abstract void notifyAllObserver();
}
