package com.itheima.d3_final;

/**
 * 目标：明白final一些基本语法知识
 */

public class Test {
    //只能加载一次，可以共享，不可修改
    public static final String schoolName = "黑马";

    //最终静态变量可以推迟到静态代码块赋值
   public static final String schoolName2;
   static {
       schoolName2 = "白马";
       //schoolName2 = "df";不能够重复赋值
   }

   //属于对象的（final基本不用来修饰实例变量，没有意义）
    public final String name = "王麻子";

    public static void main(String[] args) {
        //final修饰变量
        final int age;
        age = 12;
        //age = 34; //第二次赋值报错了

        Test t = new Test();
        //t.name = "麻子";  静态实例变量不可以修改

        buy(0.5);
    }

    public static void buy(final double z){

    }
}

/**
 * final修饰类，类不能被继承了
 */
//final class Animal{
//
//}
//
//class Cat extends Animal{
//
//}

/**
 * final修饰方法，方法不可以被重写
 */
class Animal{
    public final void run() {
        System.out.println("动物可以跑");
    }
}

class Tiger extends Animal{
//    @Override
//    public void run() {
//        System.out.println("老虎跑的贼快");
//    }
}
