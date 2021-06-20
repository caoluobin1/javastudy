package org.clb.designpattern.abstract_factory;

/**
 * @Description
 * @Classname AnimalFactory
 * @Date 2021/6/10 15:42
 * @Author clb
 */
public interface AnimalFactory<T> {

    public T createBird();

    public T createFish();

    public T createMammal();
}
