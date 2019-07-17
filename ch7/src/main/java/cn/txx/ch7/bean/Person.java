package cn.txx.ch7.bean;

import org.springframework.context.annotation.Import;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/6/28
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
