package com.itheima.d1_package;


import com.itheima.d1_package.demo1.Animal;

public class Test {
    public static void main(String[] args) {
        //导包
        Student student = new Student();

        //不同包下的类必须导包才能使用
        Animal animal = new Animal();
    }
}
