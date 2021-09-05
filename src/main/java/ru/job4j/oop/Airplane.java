package ru.job4j.oop;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Самолет летит по воздуху.");
    }

    @Override
    public void getRefuelingCost() {
        System.out.println("Цена заправки 100000$");
    }
}
