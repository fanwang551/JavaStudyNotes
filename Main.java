package com.company.day6_9_6Exercise;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("zhao",5);
        Student student = new Student("wang",20,"20220906",100);
        System.out.println(person.say());
        System.out.println(student.say());
    }
}
