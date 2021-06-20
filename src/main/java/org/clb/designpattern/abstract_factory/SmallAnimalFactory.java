package org.clb.designpattern.abstract_factory;

/**
 * @Description
 * @Classname BirdFactory
 * @Date 2021/6/10 15:57
 * @Author clb
 */
public class SmallAnimalFactory<SmallAnimal> extends AbstractAnimalFactory {

    @Override public SmallAnimal createBird() {

        return (SmallAnimal) super.createAnimal(AnimalEnum.Clownfish);
    }

    @Override public SmallAnimal createFish() {
        return null;
    }

    @Override public SmallAnimal createMammal() {
        return null;
    }
}
