package com.itheima.d13_interface_jdk8;


public interface SportManInter {
    /**
     * 1、JDK 8开始 ： 默认方法(实例方法)
     * 必须default修饰，默认用public修饰
     * 默认方法。接口不能创建对象，这个方法只能过继给实现类，由实现类的对象调用
     */

    public default void run() {
        //go();我的jdk版本不够
        System.out.println("跑的很快");
    }

    /**
     * 2、静态方法
     * 必须用static修饰，默认用public修饰
     * 接口的静态方法，必须接口名自己调
     */

    public static void inAddr(){
        System.out.println("我们都在学习Java新增方法的语法，它是Java源码自己会用到的");
    }

    /**
     * 3、私有方法(实例方法)
     * jdk9开始才支持的
     * 必须在接口内部才能访问
     */
//    private void go() {
//        System.out.println("开始跑");
//    }                                        我的jdk版本不够
}

class PingPongMan implements SportManInter {

}

class Test{
    public static void main(String[] args) {
        PingPongMan p = new PingPongMan();
        p.run();


        SportManInter.inAddr();
        //PingPongMan.inAddr(); //接口静态方法只能由接口名来调
    }
}
