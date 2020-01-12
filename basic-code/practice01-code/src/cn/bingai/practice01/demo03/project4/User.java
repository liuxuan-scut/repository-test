package cn.bingai.practice01.demo03.project4;

public class User {

    private String name;//姓名
    private int money;//余额，也就是当前用户拥有的钱数

    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    //显示一下当前用户有多少钱
    public void show(){
        System.out.println("我叫：" + name + ",我有多少钱：" + money);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}