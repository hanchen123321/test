package com.itheima.d7_abstract_test;

public class Test {
    public static void main(String[] args) {
        GoldCard c = new GoldCard();
        c.setMoney(10000);//调用父类
        c.setName("张三");
        c.pay(300);
    }
}
