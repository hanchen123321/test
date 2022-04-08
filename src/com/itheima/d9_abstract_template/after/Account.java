package com.itheima.d9_abstract_template.after;

public abstract class Account {
    private String cardId;
    private double money;

    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    /**
     登录结算利息
     */
    public final void handle(String loginName , String passWord ){//模板方法尽量不可以重写，这样更加安全和专业
        // a.判断登录是否成功
        if("itheima".equals(loginName) && "123456".equals(passWord)){
            System.out.println("登录成功。。");
            // b.正式结算利息
            //当前模板方法知道所有子类账户都要结算利息，但具体怎么结算，模板方法不清楚，交给集体的子类来计算
            double result = calc();
            // c.输出利息详情
            System.out.println("本账户利息是："+ result);
        }else{
            System.out.println("用户名或者密码错误了");
        }
    }


    public abstract double calc();

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
