package ru.job4j.oop;

public class College {

    public static void main(String[] args) {
        Freshman vlad = new Freshman();
        Student student = (Student) vlad;
        Object obj = (Object) student;
    }
}
