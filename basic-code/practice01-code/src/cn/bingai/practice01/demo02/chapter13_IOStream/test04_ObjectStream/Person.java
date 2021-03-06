package cn.bingai.practice01.demo02.chapter13_IOStream.test04_ObjectStream;

import java.io.Serializable;

/**
 * Person需要满足如下的要求，才可以序列化
 * 1.需要实现接口，Serialization
 * 2.需要当前类提供一个全局常量：serialVersionUID
 * 3.除了当前Person类需要实现Serialization接口之外，
 *   还必须保证内部所有的属性也必须是可序列化的。（默认情况下，基本数据类型都是可序列化的）
 *
 *
 * 补充：ObjectOutputStream和ObjectInputStream不能序列化static和transient修
        饰的成员变量
 * @author bingai
 * @create 2019-11-10 9:34
 */
public class Person implements Serializable{

    public static final long serialVersionUID = -520L;

    private String name;
    private transient int age;
    //private int id;
    private Account acc;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, Account acc) {
        this.name = name;
        this.age = age;
        this.acc = acc;
    }

/*public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }*/

    /*public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }*/

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

   /* @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }*/

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", acc=" + acc +
                '}';
    }
}

class Account implements Serializable{
    private double banlance;

    public Account() {
    }

    public Account(double banlance) {
        this.banlance = banlance;
    }

    public double getBanlance() {
        return banlance;
    }

    public void setBanlance(double banlance) {
        this.banlance = banlance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "banlance=" + banlance +
                '}';
    }
}
