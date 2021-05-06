package org.clb;


import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableMap;
import org.clb.designpattern.abstractfactory.AbstractFactory;
import org.clb.designpattern.abstractfactory.ColorFactory;
import org.clb.util.myexception.WrongFactoryException;
import org.junit.Test;

import java.util.Iterator;
import java.util.Map;

public class JoinerTest1 {
    @Test
    public void spilterTest(){
        Iterator<String> split =  Splitter.on("#").split("ac#asd#sss").iterator();
        while (split.hasNext()){
            System.out.println(split.next());
        }
    }
    @Test
    public void a(){
        String join = Joiner.on("&").withKeyValueSeparator("=").join(ImmutableMap.of("id", "123", "name", "green"));
        System.out.println(join);
    }
    @Test
    public void t(){
        Splitter.MapSplitter mapSplitter = Splitter.on("&").withKeyValueSeparator("=");
        final Map<String, String> join=mapSplitter.split("id=123&name=green");
    }
    @Test
    public void test2(){
        AbstractFactory a=new ColorFactory();
        try {
            a.getObject2();
        } catch (WrongFactoryException e) {
            System.out.println(WrongFactoryException.code);
        }
    }
}
