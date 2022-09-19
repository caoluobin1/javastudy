package org.clb.designpattern.decorator_pattern;

public abstract class StuDanceDecorator implements StuDance{
    private Stu stu;

    public StuDanceDecorator(Stu stu) {
        this.stu = stu;
    }

    @Override
    public void dress() {
        stu.dress();
    }
}
