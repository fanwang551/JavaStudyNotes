package com.company;
import java.util.Scanner;
public class JavaDay2_9_2 {

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

      /*多分支
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入成绩");
        float grade=sc.nextFloat();
        if(grade>=1&&grade<=100){
            if(grade>=90){
                System.out.println("成绩为优秀");
            }else if(grade>=80&&grade<90){
                System.out.println("成绩为良好");
            }else if(grade>=60&&grade<80){
                System.out.println("成绩为及格");
            }
        }else
            System.out.println("成绩为不及格");*/


        /*嵌套分支
        int adultTicketRates=40;
        int highSeasonTicketRates=60;
        int otherTicketRates=20;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入年龄");
        int age=sc.nextInt();
        System.out.println("请输入是否旺季(true or false");
        boolean season=sc.nextBoolean();
        if(season=true){
            if(age>=18&&age<=60){
                System.out.println("票价为"+highSeasonTicketRates);
            }else if(age>=1&&age<18){
                System.out.println("票价为"+highSeasonTicketRates/2);
            }else if(age>60){
                System.out.println("票价为"+highSeasonTicketRates/3);
            }
        }else{
            if(age>=18&&age<=60){
                System.out.println("票价为"+adultTicketRates);
            }else
                System.out.println("票价为"+otherTicketRates);
        }*/


        /*switch使用
        //注意：表达式数据类型应和case后的常量类型一致，或者可以互相比较的数据类型
        //swith(表达式） 表达式必须是 byte int short cahr enum String
        //case字句的值必须是常量，不能是变量
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符(a-c)");
        String alphabet=sc.next();
        switch (alphabet){
            case "a":
                System.out.println("农夫山泉");
                break;
            case "b":
                System.out.println("茶Π");
                break;
            case "c":
                System.out.println("CALAMANSI");
                break;
            default:
                System.out.println("请重新输入");
        }*/


        //for循环控制
        //循环条件是返回一个布尔值
        //for循环中初始化和变量迭代可以写在其他地方，但两边的分号不能省
        /*for(int i=1;i<99;i++){
            if(i%9==0){
                System.out.println(i);
            }
        }*/

      /*practice
        for(int i=0,j=5;i<4;i++,j--){
            System.out.println(i+"+"+j+"="+(i+j));
        }*/


        //while 循环条件是返回一个boolean值的表达式
        //while循环是先判断后执行
        /* int i=1;
        while( i<=100){
            i++;
            if(i%3==0){
                System.out.println(i);
            }
        }

        int start=40;
        int end=200;
        while(start<end){
            start++;
            if(start%2==0)
            System.out.println(start);
        }*/


        /* do while 1.先执行后判断，至少执行一次，最后有一个分号
        int i=0;
        do{
            i++;
            System.out.println(i);
        }while(i<100);

       //求和1到100
        int i=0;
        int sum=0;
        do{
            i++;
            sum+=i;
        }while (i<100);
        System.out.println(sum);


        //统计1-200间能被5整除但不能被三整除的数
        do {
            i++;
            if(i%5==0&&i%3!=0){
                System.out.println(i);
            }
        }while (i<200);*/
    }
}
