package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery batteryBox = new Battery(100);
        Battery myPhone = new Battery(20);
        System.out.println("Заряд батареи смартфона равен: " + myPhone.getLoad());
        System.out.println("Заряд повербанка равен: " + batteryBox.getLoad());
        batteryBox.exchange(myPhone);
        System.out.println("Заряд батареи смартфона равен: " + myPhone.getLoad());
        System.out.println("Заряд повербанка равен: " + batteryBox.getLoad());
    }
}
