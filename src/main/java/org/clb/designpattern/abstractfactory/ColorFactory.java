package org.clb.designpattern.abstractfactory;


import org.clb.designpattern.abstractfactory.color.Color;
import org.clb.util.enuma.ErrorCode;
import org.clb.util.myexception.WrongFactoryException;

public  class ColorFactory implements AbstractFactory<Color> {
    public Color getObject() {
        return null;
    }

    public  Color getObject2() throws WrongFactoryException {
        throw new WrongFactoryException(ErrorCode.WrongFactory.getMsg());
    }
}
