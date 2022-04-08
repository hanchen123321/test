package com.itheima.d3_final;

public class Test2 {
    public static void main(String[] args) {
        //1、final修饰的变量是基本类型：那么变量存储的数据值不能发生改变。
        final double rate = 3.14;
        //rate = 3.34;报错

        //2、final修饰的变量是引用类型：那么变量存储的地址值不能发生改变，但是地址指向的对象内容是可以发生变化的
        final int[] arr = {10,12,13};
        //arr = null;//报错，地址不可再变
        System.out.println(arr[1]);
        arr[1] = 100;
        System.out.println(arr[1]);
    }
}
