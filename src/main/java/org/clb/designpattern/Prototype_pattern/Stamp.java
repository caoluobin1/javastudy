package org.clb.designpattern.Prototype_pattern;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description
 * @Classname Stamp
 * @Date 2021/7/21 10:07
 * @Author clb
 */

@AllArgsConstructor
public class Stamp implements Cloneable{
    public String type;

    @Override
    protected Stamp clone() throws CloneNotSupportedException {
        return (Stamp)super.clone();
    }
}
