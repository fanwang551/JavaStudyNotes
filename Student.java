package com.company.day6_9_6Exercise;

public class Student extends Person{
    private String ID;
    private int score;

    public Student(String name, int age, String ID, int score) {
        //调用父类构造器
        super(name, age);
        this.ID = ID;
        this.score = score;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String say(){
        return "我的名字是"+getName()+"我"
                +getAge()+"岁"+"我的学号是"+ID+"我的成绩是"+score;
    }
}
