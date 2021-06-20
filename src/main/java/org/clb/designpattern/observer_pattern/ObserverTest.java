package org.clb.designpattern.observer_pattern;

/**
 * @Description
 * @Classname ObserverTest
 * @Date 2021/5/24 11:55
 * @Author clb
 */
public class ObserverTest {

    public static void main(String[] args) {
        ConcretObserverList list=new ConcretObserverList();
        list.add(new Observer1());
        list.add(new Observer2());
        list.notifyAllObserver();

    }

}
