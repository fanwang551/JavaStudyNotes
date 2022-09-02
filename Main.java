package com.company;

public class Main {

    public static void main(String[] args) {
	// java review day1 9.1 write your code here
     /*   System.out.println("HelloWorld");
        System.out.println("书名\t作者\t价格\t销量\n小王子\t埃克苏佩\t20\t1000\t");
        System.out.println("书名\t小王子\n作者\t埃克苏佩\n价格\t20\n销量\t1000");
    */
     //boolean数据类型
      /*  boolean pass=true;
        if(pass==true){
            System.out.println("通过考试");}
		   else{
            System.out.println("未通过考试");}*/


        //自动类型转换 五点
        /*1.多种数据类型转换时，先转换陈精度高的再计算
        int n1=10;
        float d1=n1+1.1f;
        double d2=n1+1.1;
        System.out.println(d1);
        System.out.println(d2);*/

        /*2.不能将精度大的数据类型赋值给精度小的数据类型
        int n=1.1;//错误
        */

        /*3.(byte  short)和char间不能相互转换
        byte n=10;
        int n1=10;
        byte n2=n1;/错误
        char c1=n;//错误
        */
          /*4.byte short char 间可以进行计算，计算时首先转换成int型
          byte b1=1;
          byte b2=2;
          short s1=1;
          int s2=b1+s1;
          System.out.println(s2);
          //byte b3=b1+B2;错误，首先转换成int*/

        /*5.boolean不进行数据类型转换，表达式结果数据类型自动转换成操作数中最大的
        */


      //强制类型转换
        /*1.数据类大转小，char类型能保存int型常量值，但不能保存变量值
        char c1=10;
        int n=97;
        char c2=(char)n;
        System.out.println(c2);//10对应的字符，输出为a*/

        /*基本数据类型转换成String
        int n1=1;
        float f1=1.1f;
        double d1=1.2;
        boolean b1=true;
        String s1=n1+"";
        String s2=f1+"";
        String s3=d1+"";
        String s4=b1+"";
        System.out.println(s1+""+s2+""+s3+""+s4);*/

        /*String转换成基本数据类型
        String s5="20";
        int n1=Integer.parseInt(s5);
        double n2=Double.parseDouble(s5);
        float n3=Float.parseFloat(s5);
        boolean n4=Boolean.parseBoolean("true");
        byte n5=Byte.parseByte(s5);//超过128 错误
        System.out.println(n4);
        //得到字符串某个位置的值
        System.out.println(s5.charAt(0));*/

        /*Homework
        String BookName1="小王子";
        String BookName2="红楼梦";
        System.out.println("BookName"+BookName1+"\\"+BookName2);
        String Name="王帆";
        int Year=20;
        int Grade=100;
        String Sex="男";
        String Hobby="Play basketball";
        System.out.println("姓名"+"\t"+"年龄"+"\t"+"成绩"+"\t"+"性别"+"\t"+"爱好"
                +"\n"+Name+"\t"+Year+"\t"+Grade+"\t"+Sex+"\t"+Hobby);*/



        //instanceof 检查是否是类对象；逻辑运算符最终结果为Boolean值


        /*&&短路，如果第一个结果为false，后面条件不在判断；&逻辑与第一个条件为false，后面的条件仍会判断
        int x=5;
        int y=5;
       // int x1=x++;
       // int y1=++y;
        if(x++==6&&++y==6){
            x=11;
        }
        System.out.println(y);//y=5,因为是短路与不会计算++y
        if(x++==6&++y==6){
            x=11;
        }
        System.out.println(y);//y=6,因为是逻辑与，会计算++y*/


        /*一道经典例题
        boolean x=true;
        boolean y=false;
        short s=46;
        if((s++==46)&&(y=true)) {//s++已计算，s=47
            s++;
        }
        if((x=false)||(++s==49)) {
            s++;
        }
        System.out.println(s);s=50*/


        /*符合赋值运算符会进行类型转换
        byte b=1;
        b+=2;//b=(byte)(b+2)
        b++;//b=(byte)(b+1)
        System.out.println(b);*/



    }

}
