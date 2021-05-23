package org.clb.structure.comparator;

/**
 * @Description
 * @Classname Student
 * @Date 2021/5/21 0:03
 * @Author clb
 */
public class Student {

    int id;
    int age;

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", age=" + age + '}';
    }

    public Student(int id, int age) {
        this.id = id;
        this.age = age;
    }
}
