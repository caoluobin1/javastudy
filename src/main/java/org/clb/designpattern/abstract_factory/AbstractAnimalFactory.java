package org.clb.designpattern.abstract_factory;

import org.clb.designpattern.abstract_factory.animal.Animal;

/**
 * @Description
 * @Classname AbstractAnimalFactory
 * @Date 2021/6/10 15:45
 * @Author clb
 */
public abstract class AbstractAnimalFactory implements AnimalFactory {

    protected Animal createAnimal(AnimalEnum animalEnum) {
        Animal a = null;
        try {
            a = (Animal) Class.forName(animalEnum.getClassName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return a;
    }

    enum AnimalEnum {
        Tiger("org.clb.designpattern.abstractfactory.animal.big.Tiger"), Clownfish("org.clb.designpattern.abstractfactory.animal.small.Clownfish"), Owl("org.clb.designpattern.abstractfactory.animal.big.Owl");
        String className;

        AnimalEnum(String className) {
            this.className = className;
        }

        public String getClassName() {
            return className;
        }

        public void setClassName(String className) {
            this.className = className;
        }
    }

}
