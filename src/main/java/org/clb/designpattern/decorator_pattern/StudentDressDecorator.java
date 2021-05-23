package org.clb.designpattern.decorator_pattern;

/**
 * @Description
 * @Classname StudentDressDecorator
 * @Date 2021/5/21 14:26
 * @Author clb
 */
public class StudentDressDecorator extends StudentDeCorator {

    public StudentDressDecorator(Stu student) {
        super(student);
    }

    @Override
    public void dress() {
        super.dress();
        ((Student)this.student).setClothes("JK");
    }
}
