package com.company.Extend;

public class Extend01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name="小王";
        pupil.age=5;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();

        Graduate graduate = new Graduate();
        graduate.name="二混子";
        graduate.age=25;
        graduate.testing();
        graduate.setScore(59);
        graduate.showInfo();
    }
}


