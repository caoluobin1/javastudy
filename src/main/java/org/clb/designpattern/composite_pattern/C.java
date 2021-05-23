package org.clb.designpattern.composite_pattern;

/**
 * @Description
 * @Classname C
 * @Date 2021/5/21 16:42
 * @Author clb
 */
public interface C<T> {
    public boolean hasnext();
    public void add(T t);
    public void operation();
}
