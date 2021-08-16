package ru.job4j.oop;

public class Student {

    public void song() {
        System.out.println("I believe I can fly");
    }

    public void music() {
        System.out.println("Tra tra tra");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        for (int counter = 0; counter < 3; counter++) {
            petya.song();
            petya.music();
        }
    }
}
