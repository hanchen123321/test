package com.itheima.d9_abstract_template.after;

/**
  活期账户
 */
public class CurrentAccount extends Account{
    @Override
    public double calc() {
        //正式结算利息
        double result = getMoney() * 0.0175;  //结算利息
        return result;
    }

    public CurrentAccount() {
    }

    public CurrentAccount(String cardId, double money) {
        super(cardId, money);
    }
}
