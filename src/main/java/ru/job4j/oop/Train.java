package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Поезд едет по рельсам.");
    }

    @Override
    public void getRefuelingCost() {
        System.out.println("Цена заправки 10000$");
    }
}
