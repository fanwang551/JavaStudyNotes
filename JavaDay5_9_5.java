package com.company;

public class JavaDay5_9_5 {
    public static void main(String[] args){
    //复习day4,完成 面向对象初级
    //方法递归调用
        /*
        1‘执行一个方法时，就创建一个受保护的独立空间（栈空间）
        2，方法的局部变量是独立的，不会相互影响
        3.如果方法中使用的是引用数据类型（数组，对象）就会共享该类型的数据

        */

   /* RecursionTest r=new RecursionTest();
    r.test(4);
    int res=r.factorial(5);
    System.out.println("5的阶乘="+res);*/

      /*
        //求斐波那契数
        Fibonacci f=new Fibonacci();
        int n=7;
        int res= f.Fibona(n);
        System.out.println("当n="+n+"n对应的斐波那契数="+res);*/


        /*
        //猴子吃桃问题
        Test t =new Test();
        int day=8;
        int peachNum=t.peach(day);
        if(peachNum!=-1){
            System.out.println("第"+day+"天有"+peachNum+"个桃子");
        }*/




        /*迷宫
        int [][] map=new int[8][7];
        //将最上最下赋值1
        for(int i=0;i<7;i++){
            map[7][i]=1;
            map[0][i]=1;
        }
        //将最左最右赋值1
        for(int i=0;i<8;i++){
            map[i][0]=1;
            map[i][6]=1;
        }
        map[3][1]=1;
        map[3][2]=1;
        map[2][2]=1;
        System.out.println("=====当前地图情况======");
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
                //输出一行
                }
            System.out.println();
        }
        Test t1=new Test();
        t1.findWay(map,1,1);
        System.out.println("=====找路情况======");
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
                //输出一行
            }
            System.out.println();
        }*/

        /*汉诺塔
        Test t2=new Test();
        int num=2;                                         ;
        t2.move(num,'A','B','C');*/


}
}
//打印和求递归
/*class  RecursionTest {
    //打印
    public  void test(int n){
        if(n>2){
            test(n-1);
        }
        System.out.println("n="+n);
    }
    //求阶乘
    public int factorial(int n){
        if(n==1){
            return 1;
        }else{
            return factorial(n-1)*n;
        }
    }
}*/

/*
class Fibonacci{
    public int Fibona(int n){
        if(n==1||n==2){
            return 1;
        }else{
            return Fibona(n-1)+Fibona(n-2);
        }
    }
}*/

//class Test {
    /*
    猴子吃桃
    public int peach(int n){
        if(n==10){
            return 1;
        }else{
            return 2*(peach(n+1)+1);
        }
    }*/
    //迷宫找路
    /*public boolean findWay(int[][] map, int i, int j) {
        //表示已经到达
        if (map[6][5] == 2) {
            return true;
        } else {
            //表示可以走通
            if (map[i][j] == 0) {
                map[i][j] = 2;

                //上左下右四个方向找路
                if (findWay(map, i - 1, j)) {
                    return true;
                }
                //左
                else if (findWay(map, i, j - 1)) {
                    return true;
                }
                //下
                else if (findWay(map, i + 1, j)) {
                    return true;
                }
                //右
                else if (findWay(map, i, j + 1)) {
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }
    //路径发生改变
    public boolean findWay2(int[][] map, int i, int j) {
        //表示已经到达
        if (map[6][5] == 2) {
            return true;
        } else {
            //表示可以走通
            if (map[i][j] == 0) {
                map[i][j] = 2;

                //上左下右四个方向找路
                if (findWay2(map, i , j-1)) {
                    return true;
                }
                //you
                else if (findWay2(map, i+1, j )) {
                    return true;
                }
                //shang
                else if (findWay2(map, i , j+1)) {
                    return true;
                }
                //zuo
                else if (findWay2(map, i+ 1, j )) {
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }*/


    /*汉诺塔
    public void move(int num,char a,char b,char c){
        //只有一个
        if(num==1){
        System.out.println(a+"——>"+c);
    }else{//有多个，将所有盘看成最上面和最下面一块两部分
            move(num-1,a,c,b);
            //把最下面的移动到c
            System.out.println(a+"——>"+c);
            //再把 b 塔的所有盘，移动到 c ,借助 a
            move(num-1,b,a,c);
        }
    }
}*/