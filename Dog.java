package com.company.Override01;
//细节: 子类方法的返回类型和父类方法返回类型一样，
// 或者是父类返回类型的子类 比如 父类 返回类型是 Object ,
// 子类方法返回类型是 String
public class Dog extends Animal{
    public void cry(){
        System.out.println("小狗旺旺");

    }
    //重写m1方法，String是Object的子类
    public String m1(){
        return null;
    }
    //重写m1方法，Object是String的父类
    /*public Object m2(){
        return null;
    }*/
    public son m3(){
        return null;
    }

}
