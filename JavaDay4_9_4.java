package com.company;
import java.util.Scanner;
public class JavaDay4_9_4 {
    public static void main(String[] args) {
        //复习day3,完成数组和部分面向对象(传参机制重要  成员方法传参 方法递归调用）
        /*数组的缩减
        int[] arr1 = {1, 2, 3, 4};

        do {
            int[] arr2 = new int[arr1.length - 1];
            for (int i = 0; i <= arr2.length - 1; i++) {
                arr2[i] = arr1[i];
            }
            arr1 = arr2;
            System.out.println("缩减后");
            for(int i=0;i<=arr1.length-1;i++){
                System.out.println(arr1[i]);
            }
            if(arr2.length==1){
                System.out.println("当前只有只有一个元素，不能进行缩减");
                break;
            }else{
                Scanner sc=new Scanner(System.in);
                System.out.println("请选择是否继续缩减");
                char key=sc.next().charAt(0);
                if(key=='n'){
                    break;
                }
            }
        }while(true);*/

        /*冒泡排序
        int[] arr={6,5,7,3,8,9,4};
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                  temp=  arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }*/

        /*查找
        int [] arr={1,2,3,4,5,6,8,10};
        int start=0,end=arr.length-1,mid=0;

        System.out.println("请输入查找数据");
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        if(key < arr[start] || key > arr[end] || start > end){
           System.out.println("请重新输入");
        }
        while(start<=end){

            int midV=arr[(arr.length-1)/2];
            if(key<arr[mid]){
                end=mid+1;
            }else if(key>arr[mid]){
                start=mid-1;
            }else{
                System.out.println(mid);
                break;
            }
            mid=(start+end)/2;
        }*/

        /*二维数组
        int[][] arr={{1,2,3,4,5,},{2,3,1,4,5}};
        //数组元素个数
        System.out.println(arr.length);
        //元素位置
        System.out.println(arr[0][3]);
        //输出数组
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/

        /*int arr[][]={{4,6},{1,4,5,7},{-2}}; 遍历该二维数组，并得到和
        int arr[][]={{4,6},{1,4,5,7},{-2}};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);*/

        /*杨辉三角
        int[][] yangHui=new int[12][];
        for(int i=0;i<yangHui.length;i++){
            //给每个一维数组开空间
             yangHui[i]=new int[i+1];
             for(int j=0;j<yangHui[i].length;j++){
                 if(j==0||j==yangHui[i].length-1){
                     yangHui[i][j]=1;
                 }else {
                     yangHui[i][j]=yangHui[i-1][j]+yangHui[i-1][j-1];
                 }
             }
        }
        for(int i=0;i<yangHui.length-1;i++){
            for(int j=0;j<yangHui[i].length;j++){
                System.out.print(yangHui[i][j]+"\t");
            }
            System.out.println();
        }*/


        /*有序数组中插入元素
        int[] arr={1,2,4,5,9,100};
        int temp=0;
        int index=-1;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入插入的数");
        int num=sc.nextInt();
        for(int i=0;i<arr.length-1;i++){
            if(num<=arr[i]){
                index=i;
                break;
            }
        }
        if(index==-1){
            index=arr.length;
        }
     //   System.out.println(index);
        //扩容
        int[] arr1=new int[arr.length+1];
        //把index的位置空出来
        for(int i=0,j=0;i<arr1.length;i++){
            if(i!=index){
                arr1[i]=arr[j];
                j++;
            }else{
                arr1[i]=num;
            }
        }
        arr=arr1;
        //打印
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }*/




        /*面向对象编程
        //类与对象 类是对象的一个模板，对象是类的一个个体，对象是一个实例
        //方法调用机制
        1.当程序执行到方法时，就会开辟一个独一的空间（栈空间）
        2.当方法执行完毕或者执行到return就会返回
        3.返回到调用方法的地方
        4。返回时继续执行方法后面的代码
        5.当main方法执行完毕，整个程序退出
        //成员方法的好处
        1.提高代码的复用性
        2.可以实现的细节封装起来，然后供其他用户调用即可

        //方法调用的细节
        1.形参和实参的类型要一致或兼容，个数顺序必须一致
        2。一个方法最多有一个返回值
        3.方法不能嵌套使用
        */

        /*class AA
        AA c=new AA();
        if(c.isOdd(2)){
            System.out.println("是奇数");
        }else{
            System.out.println("是偶数");
        }*/

    //1.基本数据类型的传参机制 传递的是值，形参的任何改变不会影响实参
       /* int a=10,b=20;
        AA obj=new AA();
        obj.swap(a,b);
        System.out.println("main 方法 a=" + a + " b=" + b);//a=10 b=20*/

        //2.引用数据类型的传参机制 传递的是地址（这个值是地址）
       /* B b=new B();
        int[] arr={1,2,3};
        b.changeArr(arr);
        //10 2 3 main中的arr发生改变
        System.out.println("main方法中的数组");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"\t");
        }*/

        //3.对象也是引用数据类型
        Person p=new Person();
        p.age=10;
        p.name="xioaming";
        p.changeAge(p);
        //main中输出为100，改变
        //p=null;main中的值不会改变，相当于将调用的p指向null,但main中的p所指不会改变
        System.out.println("main中age="+p.age);



        /*成员方法的传参机制
        1.基本数据类型的传参机制传递的是值，形参的任何改变不会影响实参
        2.引用数据类型的传参机制 传递的是地址（这个值是地址）
        3.对象也是引用数据类型（方法的传参机制）
        //内存区中分栈，堆，方法区三个部分；
        （栈中执行main）首先访问到new对象时在堆中生成一个地址空间，
        该地址空间中存放对象中的基本数据类型和引用数据的地址，在方法区生成该引用数据类型的空间
        在调用方法时，会在栈中重新分配空间和main的执行相互独立

        */

    }

}

/*class AA{
    public boolean isOdd(int num) {
    if(num%2==0){
        return false;
    }else{
        return  true;
    }
    }
    public void swap(int a,int b){
        System.out.println("\na 和 b 交换前的值\na=" + a + "\tb=" + b);//a=10 b=20
        int temp=a;
        a=b;
        b=temp;
        System.out.println("\na 和 b 交换后的值\na=" + a + "\tb=" + b);//a=20 b=10

    }
}*/



class B{
    public void changeArr(int arr[]){
        arr[0]=10;
        //10 2 3
        System.out.println("方法中的数组");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"\t");
        }
    }

}
class Person{
    int age;
    String name;
    public void changeAge(Person p){
        p.age=100;
        //p=null;main中的值不会改变，相当于将调用的p指向null,但main中的p所指不会改变

        //重新在堆中生成地址空间，不会在main中输出。相当于垃圾空间
       /* Person p=new Person();
        p.age=100;
        p.name="lihua";*/
    }
}

