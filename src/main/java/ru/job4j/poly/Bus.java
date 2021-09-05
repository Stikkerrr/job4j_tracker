package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void ride() {
        System.out.println("Автобус едет по маршруту.");
    }

    @Override
    public void setPassengers(int passengers) {
        System.out.println("Количество пассажиров: " + passengers);
    }

    @Override
    public int refuel(int price) {
        return price;
    }
}
