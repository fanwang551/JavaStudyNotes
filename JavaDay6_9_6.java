package com.company;
/*public class JavaDay6_9_6 {
    //复习 方法的调用机制 成员的传参机制 方法递归调用  重载 this  构造器
//    完成部分面向对象中级
//    包的作用区分相同名字的类 当类很多时，可以很好的管理类  控制访问范围
    public static void main(String[] args) {
        Tom tom = new Tom();
        int isWinCount=0;
        //二维数组接收局数
        int[][] arr=new int[3][3];
        int j=0;
        //一维数组接收输赢
        String[] arr1=new String[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            //玩家出拳
            System.out.println("输入 0，1，2");
            int num=scanner.nextInt();
            tom.setTomChoice(num);
            int tomChoice= tom.getTomChoice();
            arr[i][j+1]=tomChoice;
            int computerChoice=tom.computerChoice;
            String isWin = tom.play();
            arr1[i] = isWin;
            arr[i][j] = tom.count;

            System.out.println("=====================");
            System.out.println("局数\t玩家出拳\t电脑出拳\t输赢情况");
            System.out.println(tom.count+"\t"+tom.tomChoice+"\t"+tom.computerChoice+"\t"+tom.winCount+"\t");
            System.out.println("\n\n");
            isWinCount=tom.winCount;
        }
    }
}
    class Tom {
        public int tomChoice;
        public int computerChoice;
        public int winCount;
        public int count = 1;

        public int computerChoice() {
            Random random = new Random();
            computerChoice = random.nextInt(3);
            return computerChoice;
        }

        public void setTomChoice(int tomChoice) {
            if (tomChoice > 2 || tomChoice < 0) {
                throw new IllegalArgumentException("数字输入错误");
            }
            this.tomChoice = tomChoice;
        }

        public int getTomChoice() {
            return tomChoice;
        }

        public String play() {
            if (tomChoice == 0 && computerChoice == 1) {
                return "you win";
            } else if (tomChoice == 1 && computerChoice == 2) {
                return "you win";
            } else if (tomChoice == 2 && computerChoice == 0) {
                return "you win";
            } else if (tomChoice == computerChoice) {
                return "平局";
            } else {
                return "you lost";
            }
        }
        public int count(String s){
            count++;
            if(s.equals("you win")){
                winCount++;
            }
            return winCount;
        }
    }*/

//封装测试
/*
public class JavaDay6_9_6 {
    public static void main(String[] args) {
        People people = new People("xiaoming", 19, 100000.0);
        System.out.println(people.info());
        //'age' 在 'com.company.People' 中具有 private 访问权限 不能直接访问
       // System.out.println(people.age);

        People people1 = new People();
        people1.setName("wang");
        people1.setAge(20);
        people1.setSalary(100000);
        System.out.println(people1.info());

        //通过get方法可以访问
        System.out.println(people.getAge());
        //'age' 在 'com.company.People' 中具有 private 访问权限 不能直接访问
       // people.age =18;
        //通过get方法可以访问
       // people.setAge(16);
        //System.out.println(people.getAge());
    }
}
    class People{
        public String name;
        private int age;
       private double salary;

        //无参构造
        public People() {
        }
        //三个参数的构造器
        public People(String name, int age, double salary) {
           // this.name = name;
            //this.age = age;
          //  this.salary = salary;
            setAge(age);
            setName(name);
            setSalary(salary);

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            if (name.length() >= 2 && name.length() <= 6) {
                this.name = name;
            }else{
                System.out.println("名字长度不符合，需要2-6个字符");
                this.name="无名氏";
            }
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if(age>=1&&age<=120){
                this.age = age;
            }else {
                System.out.println("年龄不符合要求 1-120");
                this.age=18;
            }

        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
        public  String info(){
            return "name="+name+"age="+age+"salary="+salary;
        }
    }
*/

//继承测试  子类会自动拥有父类定义的属性和方法
//优点：代码的复用性，扩展性，维护性提高
//extend01中
/*细节
笔记 290页




*/
public class JavaDay6_9_6 {
    public static void main(String[] args) {

    }
}
