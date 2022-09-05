package com.company;

public class JavaDay5_9_5_1 {
    public static void main(String[] args){

        /*方法重载，java中允许东一个类中，多个同名的方法的存在，但形参列表不一致。
        //注意：1.方法名必须相同；2。形参列表必须不同（形参类型或个数或顺序，至少有一样不同，参数名无要求
        //好处 减轻起名记名的麻烦
        Mycalculator myC=new Mycalculator();
       System.out.println( myC.calculate(1,2));
        System.out.println(myC.calculate(1.0,2.0));
        System.out.println(myC.calculate(1,2,3));*/
        /*
        //可变参数 java中将同一个类中多个同名同功能但参数个数不同的方法，封装成一个方法
        //注意 可变参数的实参可以是0个或者多个；2.实参可以是数组；3.可变参数的是指是数组
        //4.可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数放在最后
        //5，一个形参列表中只能出现一个可变参数
        VarParameter var=new VarParameter();
        System.out.println(var.sum(1,2,3));
        System.out.println(var.sum(1,2,3,4));*/

        /*可变参数练习
       VarParameterExercise varE=new VarParameterExercise();
       System.out.println(varE.info("小明",80,90));
        System.out.println(varE.info("小明",80,90,99));*/


        //变量作用域 1.属性和变量可以重名，访问时遵循就近原则
        // 2，在同一个作用域中，比如在同一个方法中两个局部变量不能重名
        //3.作用域范围：全局变量可以被本类使用，或其他类使用（通过对象调用） 局部变量只能在本类中使用
        //4，全部变量可以加修饰符，局部变量不可以



        /*构造方法
        //1.主要作用是完成对新对象的初始化。（Person p=new Person("xiaoming",20)和
        //（Person p=new Person()
        // p.name="xiaoming",p.age=20
        //特点：方法名和类名必须一样；没有返回值 在创建对象时系统会自动的调用该类的构造器完成对新对象的初始化
        //如果没有定义构造器，系统会自动生成一个无参构造器（默认构造器）
        //一旦定义了自己的构造器，默认构造器就被覆盖了，除非显示的定义一下
        Person1 p=new Person1("xiaoming",20);
        System.out.println("name="+p.name+" "+"age="+p.age);
        Person1 p1=new Person1("xiaohua");
        System.out.println("name="+p1.name);
        //无参构造
        Dog d=new Dog();*/

        /*this关键字
        //那个对象调用，this就代表那个对象
        //1) this 关键字可以用来访问本类的属性、方法、构造器
        // 2) this 用于区分当前类的属性和局部变量
        // 3) 访问成员方法的语法：this.方法名(参数列表);
        //4) this 不能在类定义的外部使用，只能在类定义的方法中使用。
        Cat cat1=new Cat("大黄",3);
        cat1.info();
        Cat cat2=new Cat("小白",2);
        cat2.info();*/

        Person2 p1=new Person2("marry",20);
        Person2 p2=new Person2("marry",20);

        //hashcode不是地址，用于理解
        //p1 的 hashcode=460141958
        //p1 的 hashcode=1163157884,是两个不同的地址空间，this存放相应的地址
        System.out.println("p1 和 p2 比较的结果=" + p1.compareTo(p2));
        System.out.println("p1 的 hashcode=" + p1.hashCode());
        System.out.println("p2 的 hashcode=" + p2.hashCode());
       // System.out.println("p2的 hashcode=" + p2.name.hashCode());
        //System.out.println("p1的 hashcode=" + p1.name.hashCode());
    }
}
//方法重载
/*class Mycalculator{
    public int calculate(int a ,int b){
        System.out.println("a+b=");
        return a+b;
    }
    public double calculate(double a ,double b){
        System.out.println("a/b=");
        return a/b;
    }
    public int calculate(int a ,int b,int c){
        System.out.println("a+b+c=");
        return a+b+c;
    }
}*/



/*可变参数
class VarParameter{
    public int sum(int...nums){
        System.out.println("参数个数"+nums.length);
        int res=0;
        for(int i=0;i<nums.length;i++){
            res+=nums[i];
        }
        return res;
    }
}*/

/*class VarParameterExercise{
    public String info(String name,int...grades){
        int totalGrades=0;
        for(int i=0;i<grades.length;i++){
            totalGrades+=grades[i];
        }
       return name+"有"+grades.length+"门课，总分为"+totalGrades;
    }

}*/

/*构造器举例

class Person1{
    //第一个构造器，默认null 0
    public String name;
    public int age;
    //第二个构造器 定义name和age
    public Person1(String Pname,int Page){
        System.out.println("构造器被调用，完成对象的初始化");
        //不能用name=name?(this关键字）
        name=Pname;
        age=Page;

    }
    //第三个构造器,只定义name
    public Person1(String Pname){
        name=Pname;
    }
    //无参构造举例
}
class Dog{
    //显示定义一下
    Dog(){

    }
}*/

/*this测试
class Cat{
    public String name;
    public int age;
    public Cat(String name,int age){
        this.name=name;
        this.age=age;
    }
    public  void info(){
        System.out.println(this.name+"\t"+this.age+
                "\t"+"当前对象的hashcode是"+this.hashCode());
    }
}*/


//this exercise 锻炼
class  Person2{
    public String name;
    int age;
    public Person2(String name,int age ){
        //this相当于对象本身（堆中的对象空间，所以一个对象对应一个age.this指向自己）
        this.name=name;
        this.age=age;
    }
    public boolean compareTo(Person2 p2){
      /* if(this.name.equals(p2.name)&&this.age==p2.age){
            return true;
        }else{
            return false;
        }*/
       return this.name.equals(p2.name)&&this.age==p2.age;
    }
}

