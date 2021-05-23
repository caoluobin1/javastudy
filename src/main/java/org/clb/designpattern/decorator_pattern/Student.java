package org.clb.designpattern.decorator_pattern;

/**
 * @Description
 * @Classname Student
 * @Date 2021/5/21 14:19
 * @Author clb
 */
public class Student implements Stu {
    String name;
    String clothes="空气";

    @Override
    public String toString() {
        return "我叫'" + name + '\'' + ", 是一个穿了'" + clothes + '\'' + "的学生";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    @Override
    public void dress() {
        this.setClothes("空气");
    }
}
