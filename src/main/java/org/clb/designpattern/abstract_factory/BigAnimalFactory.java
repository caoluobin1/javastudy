package org.clb.designpattern.abstract_factory;

/**
 * @Description
 * @Classname MegafaunaAnimalFactory
 * @Date 2021/6/10 16:19
 * @Author clb
 */
public class BigAnimalFactory<BigAnimal> extends AbstractAnimalFactory {

    @Override public BigAnimal createBird() {
        return (BigAnimal) super.createAnimal(AnimalEnum.Owl);
    }

    @Override public BigAnimal createFish() {
        return null;
    }

    @Override public BigAnimal createMammal() {
        return (BigAnimal) super.createAnimal(AnimalEnum.Tiger);
    }
}
