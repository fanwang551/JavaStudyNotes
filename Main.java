package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// java review day2 9.2 目标：复习day1;完成程序控制结构
        //  三元运算符  条件表达式？表达式1：表达式2；运算条件：条件表达式为true，运算后的结果是表达式1，否则为表达式2write your code here
        /*表达式1和表达式2要为可以赋值给接收变量的类型；或者可以自动转换或强制转换
        int a=1;
        int b=2;
        int c=a>b?(int)1.1:(int)2.2;
        double d=a>b?a:b+3;//int→double
        System.out.println(c);
        System.out.println(d);*/

        /*找最大值
        int a=2;
        int b=1;
        int c=3;
        int max=(a>b? a:b)>c? (a>b? a:b):c;
        System.out.println(max);*/


        /*java标识符命名规范
        1.数字不可以开头
        2.包名：多单词组合时所有字母小写
        3.类名，接口名：多单词组合时，所有单词首字母大写 大驼峰
        4.变量名，方法名：多单词组合时，第一个单词首字母小写，后面单词首字母大写，小驼峰
        5。常量名：所用字母都大写，多单词用下划线连接
         */


        /*scanner的使用
        Scanner sc=new Scanner(System.in);
        System.out.println("input time");
        String time=sc.next();
        System.out.println("input month");
        int  month=sc.nextInt();
        System.out.println("当前时间是：");
        System.out.println(time+month+"月");*/
        /*移位运算
        int a=1>>2;
        int b=1<<2;
        System.out.println(a+b);*/


        /*分支控制 if else
        System.out.println("请输入年龄");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>18){
            System.out.println("已成年");
        }
        else
            System.out.println("未成年");
        if(age>18){
            System.out.println("已成年");
        }
        else{
            System.out.println("未成年");
        }*/


        /*practise
        double x=12;
        double y=18;
       // method 1
       if(x>10){
            if(y<20){
                System.out.println(x+y);
            }
        }

        if(x>10&&y<20){
            System.out.println(x+y);
        }

        if((x+y)%3==0&&(x+y)%5==0){
            System.out.println("两数之和既能被三整除也能被五整除");
        }

        //判断闰年
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入年份");
        int year=sc.nextInt();
        if((year%4==0&&year%100!=0)||year%400==0){
            System.out.println("是闰年");
        }
        else
            System.out.println("不是闰年");*/


        
    }
}
