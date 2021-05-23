package org.clb.designpattern.iterator_pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.clb.designpattern.decorator_pattern.Student;

/**
 * @Description
 * @Classname IteratorTest
 * @Date 2021/5/21 15:12
 * @Author clb
 */
public class IteratorTest {

    public static void main(String[] args) {
        List<Student> stu=new ArrayList<>();
        Iterator<Student> iterator = stu.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
