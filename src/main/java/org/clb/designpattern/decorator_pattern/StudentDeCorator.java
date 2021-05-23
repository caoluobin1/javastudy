package org.clb.designpattern.decorator_pattern;

/**
 * @Description
 * @Classname StudentDeCorator
 * @Date 2021/5/21 14:24
 * @Author clb
 */
public class StudentDeCorator implements Stu{
    public Stu student;
    public StudentDeCorator(Stu student) {
        this.student = student;
    }

    @Override
    public void dress() {
        this.student.dress();
    }
}
