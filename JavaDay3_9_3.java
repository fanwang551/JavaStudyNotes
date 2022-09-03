package com.company;
import java.util.Scanner;
//java学习第三天，9.3 复习第二天，完成数组
public class JavaDay3_9_3 {
    public static void main(String[] args) {


     /*多层循环嵌套 统计 3 个班成绩情况，每个班有 5 名同学，
     求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。
     统计三个班及格人数，每个班有 5 名同学
        int classNum=3;
        int studentNum=5;
        float grade;
        int passStudent=0;

        float totalGrade=0;
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=classNum;i++){
            float sum=0;
            for(int j=1;j<=studentNum;j++){
                System.out.println("请输入第"+i+"班的第"+j+"个学生的成绩");
                 grade=sc.nextFloat();
                 if(grade>=60){
                     passStudent++;
                 }
                 sum+=grade;
                 System.out.println("成绩为"+grade);
            }
            System.out.println("第"+i+"个班的平均分为"+(sum/studentNum));
           totalGrade+=sum;
        }
        System.out.println("三个班平均分="+(totalGrade/(classNum*studentNum)));
        System.out.println("及格人数为"+passStudent);*/


    /*打印九九乘法表
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= i; j++){

                System.out.print(" " + i + "*" + j + "=" + (i * j)+"\t");//   "\t"这是JAVA语言默认的制表符号,使用此符号，打印出的乘法表格较为美观
                if(i == j){
                    System.out.print("\n");//当换行条件成立时，进行换行打印
                }

            }
        }*/

        /*for (int i = 9; i >= 1; i--){
            for (int j = 1; j <= i; j++){

                System.out.print(" " + i + "*" + j + "=" + (i * j)+"\t");//   "\t"这是JAVA语言默认的制表符号,使用此符号，打印出的乘法表格较为美观

                if(i == j){
                    System.out.print("\n");//当换行条件成立时，进行换行打印
                }
            }
        }*/
        /*int i=9;
        do{
            int j=1;
            do{
                System.out.print(i+"*"+j+"="+(i*j)+" "+"\t"); //   "\t"这是JAVA语言默认的制表符号,使用此符号，打印出的乘法表格较为美观
                j++;
            }while(j<=i);//大于i之后跳出循环

            System.out.println();
            i--;
        }while(i>=1);//小于1之后跳出循环*/



        /*空心金字塔
        int totalLevel = 5; //层数
        for(int i = 1; i <= totalLevel; i++) {
            //i 表示层数
            // 在输出*之前，还有输出 对应空格 = 总层数-当前层
            for(int k = 1; k <= totalLevel - i; k++ ) {
                System.out.print(" ");
            }
            //控制打印每层的*个数
            for(int j = 1;j <= 2 * i - 1;j++) {
                //当前行的第一个位置是*,最后一个位置也是*, 最后一层全部 *
                if(j == 1 || j == 2 * i - 1 || i == totalLevel) {
                    System.out.print("*");
                } else {
                    //其他情况输出空格
                    System.out.print(" ");
                }
            }
            //每打印完一层的*后，就换行 println 本身会换行
            System.out.println(""); }*/

        /*矩形
        for(int i=1;i<=5;i++){
            System.out.println("*****");
        }*/


        /*半个金字塔
        for(int i=1;i<=5;i++) {
            for(int j = 1;j <= i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }*/

        /*整个金字塔
        for(int i=1;i<=5;i++) {
            for (int k = 1; k<=5-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
                System.out.println("");
        }*/


        /*整个金字塔
        for(int i = 1; i <= 5; i++) {
            //i 表示层数
            // 在输出*之前，还有输出 对应空格 = 总层数-当前层
            for(int k = 1; k <= 5 - i; k++ ) {
                System.out.print(" ");
            }
            for(int j = 1;j <= 2 * i - 1;j++) {
                //当前行的第一个位置是*,最后一个位置也是*, 最后一层全部 *
                if(j == 1 || j == 2 * i - 1 || i == 5) {
                    System.out.print("*");
               }else {
                   System.out.print(" ");
               }
            }
            System.out.println(" ");
        }*/

        //break exercise
        /*1-100 以内的数求和，求出 当和 第一次大于 20 的当前数 【for + break】
        int n=0;
        int sum=0;
        for(int i=1;i<100;i++){
            sum+=i;
            if(sum>20){
                System.out.println(i);
                n=i;
                break;
            }
        }
        System.out.println(n);*/

/*实现登录验证，有 3 次机会，如果用户名为"丁真" ,密码"123"提示登录成功，
// 否则提示还有几次机会，请使用 for+break 完成
        Scanner sc=new Scanner(System.in);
        int chance=3;
        label1:
        for(int i=1;i<chance;i++){
            System.out.println("请输入用户名");
            String name=sc.next();
            System.out.println("请输入密码");
            String passwd=sc.next();
            if("丁真".equals(name)&&"123".equals(passwd)){
                System.out.println("登录成功");
                break;
            }
            chance--;
            System.out.println("还有"+chance+"次机会");
            continue label1;
        }*/

        /*homework
        int money=1000000;
       double taxRate=0.05;
       int count=0;
       int tax=1000;
       do{
           money-=money*taxRate;
           count++;
       }while(money>500000);
        if(money<=50000&&money>0){
            money-=1000;
            count++;
        }
        System.out.println(count);*/

       /*判断水仙花数
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int num=sc.nextInt();
        int hundredsPlace=(int)Math.pow(num/100,3);
        //System.out.println(hundredsPlace);
        int tenPlace=(int)Math.pow((num-num/100*100)/10,3);
        //System.out.println(tenPlace);
        int onePlace=(int)Math.pow((num%100%10),3);
        //System.out.println(onePlace);
        if((hundredsPlace+tenPlace+onePlace)==num){
            System.out.println("是水仙花数");
        }
        else
            System.out.println("不是水仙花数");*/

    /*输出1到100间不能被5整除的数，每五个一行
        int count=0;
        for(int i=1;i<=100;i++){
            if(i%5==0){
                 count++;
                System.out.print(i+" ");
                if(count%5==0){
                    System.out.println("\n");
                }
            }
        }*/

     /*输出小写的a-z以及大写的Z-A
        for(char i='a';i<='z';i++){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        for(char j='Z';j>='A';j--){
            System.out.print(j+" ");
        }*/


    /*1-1/2+1/3...1/100的和
        double sum1=0,sum2=0,sum3=0;
        for(int j=1;j<=100;j++){
            if(j%2!=0){
                sum1+=(1.0/j);
            }else{
                sum1-=(1.0/j);
            }
        }
        System.out.println(sum1);*/

        /*求1+1+2+1+2+3+...+1+...+100
        int sum=0;
        for(int i=1;i<=100;i++){
            for(int j=1;j<=i;j++){
                sum+=j;
            }
        }
        System.out.println(sum);*/





    /*数组，排序，查找
        //数组属于引用数据类型，数组型数据是对象
        //int a[]=new int[5]
    double[] weight={1.1,3.2,4.5,2.4};
    double sum=0;
    for(int i=0;i<+weight.length;i++){
        sum+=weight[i];
    }
    System.out.println("总体重"+sum+"平均体重"+(sum/ weight.length));

    double score[];
    score  =new double[5];
    for(int i=1;i<score.length;i++){
    Scanner sc=new Scanner(System.in);
    System.out.println("请输入成绩");
    score[i]=sc.nextDouble();
        }*/

        //创建一个 char 类型的 26 个元素的数组，
        /*分别 放置'A'-'Z'。使用 for 循环访问所有元素并打印出来。
        char alphabet[];
        alphabet=new char[25];
        for(int i=0;i<alphabet.length;i++){
            alphabet[i]=(char)('A'+i);
        }
        for(int i=0;i<alphabet.length;i++){
            System.out.print(alphabet[i]+" ");
        }*/

        /*请求出一个数组 int[]的最大值 {4,-1,9, 10,23}，并得到对应的下标。
        int[] num={1,2,3,4,9,10,-1};
        int max=num[0];
        int maxIndex=0;
        for(int i=0;i<num.length;i++){
            if(max<num[i])
                max=num[i];
            maxIndex=i;
        }
        System.out.print(max+"  "+maxIndex);*/


        //数组的赋值，数组在默认情况下是引用传递，赋值是地址
        /*数组拷贝 不是引用传递
        int arr1[]={1,2,3};
        int[] arr2=new int[arr1.length];
        for(int i=0;i< arr1.length;i++){
            arr2[i]=arr1[i];
        }
        //改变arr2中的 值，arr1中的值不会改变
        arr2[1]=20;
        for(int i=0;i<arr1.length;i++){
           // System.out.print(arr1[i]+" ");
            System.out.print(arr2[i]+" ");
        }*/


        /*数组反转 要求：把数组的元素内容反转。
        int arr1[]={1,2,3};
        int[] arr2=new int[arr1.length];
        for(int i=arr1.length-1;i>=0;i--){
            arr2[arr2.length-i-1]=arr1[i];
        }
        for(int i=0;i<= arr1.length-1;i++){
            //System.out.print(arr1[i]);
            System.out.print(" ");
            System.out.print(arr2[i]);
        }*/

        //数组添加/扩容
       /*要求：实现动态的给数组添加元素效果，实现对数组扩容。ArrayAdd.java
        // 1.原始数组使用静态分配 int[] arr = {1,2,3}
        // 2.增加的元素 4，直接放在数组的最后 arr = {1,2,3,4}
        // 3.用户可以通过如下方法来决定是否继续添加，添加成功，是否继续？*/
        int[] arr1 = {1, 2, 3};
        do {
            int[] arr2 = new int[arr1.length + 1];
            for (int i = 0; i <= arr1.length-1; i++) {
                arr2[i] = arr1[i];
            }
            System.out.println("请输入要添加的数");
            Scanner sc = new Scanner(System.in);
            arr2[arr2.length - 1] = sc.nextInt();
            arr1=arr2;
            for (int i = 0; i <= arr1.length-1; i++) {
                System.out.println(arr1[i] + "\t");
            }
            System.out.println("是否继续y/n");
            char key=sc.next().charAt(0);
            if( key=='n'){
                break;
            }
        }while(true);
        System.out.println("退出");
    }

    }

