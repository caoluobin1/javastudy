package org.clb.pojo;

public class User {
    String id;
    String name;
    String b = "asd";
    Integer age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User(String id, String name, String b, Integer age) {
        this.id = id;
        this.name = name;
        this.b = b;
        this.age = age;
    }
}
