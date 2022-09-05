package com.company;

public class JavaDay5_9_5_exercise {
    public static void main(String[] args){

        /*A01
        A01 a01=new A01();
        double[] arr={1,2,3,8,6,5};
        System.out.println("max="+a01.max(arr));*/

        /*A02
        A02 a02=new A02();
        String[] arr={"zhou","wu","zhen","wang"};
         String target="wang";
         System.out.println(a02.find("目标字符串的索引为"+target,arr));*/

        /*Book
        Book book=new Book();
        double price=120;
        System.out.println("当前书的价格为"+book.updatePrice(price));*/

        /*A03
        A03 a03=new A03();
        int[] oldArr={1,2,3};
        int[] newArr=a03.copyArr(oldArr);
        System.out.println("newArr=");
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+"\t");
        }*/

        /*Circle
        Circle circle=new Circle();
        double radius=6.0;
        System.out.println("周长为"+circle.perimeter(radius));
        System.out.println("面积为"+circle.Square(radius));*/

        /*Cale
        Cale cale=new Cale();
        double operator1=2.0;
        double operator2=4.0;
        System.out.println(operator1+"+"+operator2+"="+cale.add(2.0,4.0));
        System.out.println(operator1+"-"+operator2+"="+cale.subtraction(2.0,4.0));
        System.out.println(operator1+"*"+operator2+"="+cale.multiplication(2.0,4.0));
        System.out.println(operator1+"/"+operator2+"="+cale.division(2.0,4.0));*/


        //Dog
        Dog dog=new Dog("dabai","white",3);
        dog.show();
        Dog dog1=new Dog("dahuang","yellow",3);
        dog1.show();
       // System.out.println(dog.name+"的颜色"+dog.color+"\n"+"年龄"+dog.age);
    }
}

/*
class A01{
    public double max(double[] arr){
        double max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
               max=arr[i];
            }
        }
        return max;
    }
}*/

/*class A02{
    public int find(String target,String[] arr){
        for(int i=0;i<arr.length;i++){
            if(target.equals(arr[i])){
                return i;
            }
        }
        return -1;
    }
}*/

/*class Book{
    public double updatePrice(double price){
        if(price>150){
            return 150;
        }else if(price>100&&price<150){
            return 100;
        }else{
            return price;
        }
    }
}*/

/*class A03{
    public int[] copyArr(int[] oldArr){
        int[] newArr=new int[oldArr.length];
        for(int i=0;i<oldArr.length;i++){
            newArr[i]=oldArr[i];
        }
        return newArr;
    }

}*/

/*class Circle{
    public double radius;
    public double perimeter(double radius){
        return 3.14*2*radius;
    }
    public double Square(double radius){
        return 3.14*2*radius*radius;
    }
}*/

/*
class Cale{
    double operator1;
    double operator2;
    public double add(double operator1,double operator2){
        this.operator1=operator1;
        this.operator2=operator2;
        return operator1+operator2;
    }
    public double subtraction(double operator1,double operator2){
        this.operator1=operator1;
        this.operator2=operator2;
        return operator1-operator2;
    }
    public double multiplication(double operator1,double operator2){
        this.operator1=operator1;
        this.operator2=operator2;
        return operator1*operator2;
    }
    public double division(double operator1,double operator2){
        this.operator1=operator1;
        this.operator2=operator2;
        if(operator2==0){
            System.out.println("除数不能为0，请重新输入");
        }
        return operator1/operator2;
    }
}*/

class Dog{
    public String name;
    public String color;
    public int age;
    //重写，初始化对象
    public Dog(String name,String color,int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }
    public void show(){
        System.out.println("名字"+this.name+"颜色"+this.color+"\n"+"年龄"+this.age);
        //return "名字"+name+"颜色"+color+"年龄"+age;
    }
}