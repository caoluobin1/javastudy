package org.clb.designpattern.abstract_factory;

import org.clb.designpattern.abstract_factory.animal.big.BigAnimal;

/**
 * @Description
 * @Classname TestFactory
 * @Date 2021/6/10 16:29
 * @Author clb
 */
public class TestFactory {

    public static void main(String[] args) {
        BigAnimalFactory bigAnimalFactory = new BigAnimalFactory();
        BigAnimal tiger = (BigAnimal) bigAnimalFactory.createMammal();
        tiger.getName();
        tiger.shape();
    }

}
