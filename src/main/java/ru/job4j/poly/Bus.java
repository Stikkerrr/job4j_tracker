package ru.job4j.poly;

public class Bus implements Transport {
    private final int price = 45;

    @Override
    public void ride() {
        System.out.println("Автобус едет по маршруту.");
    }

    @Override
    public void setPassengers(int passengers) {
        System.out.println("Количество пассажиров: " + passengers);
    }

    @Override
    public int refuel(int fuel) {
        return price * fuel;
    }
}
