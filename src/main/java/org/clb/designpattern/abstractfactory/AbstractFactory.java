package org.clb.designpattern.abstractfactory;

import org.clb.util.myexception.WrongFactoryException;

public abstract interface AbstractFactory<T> {
    public abstract T getObject();
    public abstract T getObject2() throws WrongFactoryException;
}
