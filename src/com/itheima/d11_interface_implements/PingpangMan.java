package com.itheima.d11_interface_implements;

/**
 * 实现类（特殊的子类）
 * 必须重写所有抽象类方法，否则自己也必须是抽象类
 */
public class PingpangMan implements SportMan,Law{

    private String name;

    public PingpangMan(String name) {
        this.name = name;
    }

    public PingpangMan() {

    }

    @Override
    public void rule() {
        System.out.println(name + "要尊章守法，不能随意外出，酗酒，约会");
    }

    @Override
    public void run() {
        System.out.println(name + "必须要跑步锻炼");
    }

    @Override
    public void competition() {
        System.out.println(name + "必须参加国际比赛");
    }
}
