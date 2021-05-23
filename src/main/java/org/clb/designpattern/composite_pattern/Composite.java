package org.clb.designpattern.composite_pattern;

import java.util.ArrayList;

/**
 * @Description
 * @Classname Composite
 * @Date 2021/5/21 16:41
 * @Author clb
 */
public class Composite implements Component{
    public ArrayList<Component> list=new ArrayList<>();
    public Integer index=0;
    @Override
    public boolean hasnext() {
        if (list.size()>index)return true;
        return false;
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void operation() {
        while (this.hasnext()){
            list.get(index++).operation();
        }
    }
}
