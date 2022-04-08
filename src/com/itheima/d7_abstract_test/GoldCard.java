package com.itheima.d7_abstract_test;

public class GoldCard extends Card {
    @Override
    public void pay(double money){
        //优惠后的价格算出来
        double rs = money * 0.8;
        double lastMoney = getMoney() - rs;

        System.out.println(getName() + "当前账户总金额：" + getMoney()
                + "当前消费了：" + rs + ",消费后的余额是：" + lastMoney);

        setMoney(lastMoney);
    }
}
