package ru.job4j.oop;

public class VehicleUsage {

    public static void main(String[] args) {
        Vehicle mercedes = new Bus();
        Vehicle scania = new Bus();
        Vehicle velaro = new Train();
        Vehicle maglev = new Train();
        Vehicle airbus = new Airplane();
        Vehicle boeing = new Airplane();

        Vehicle[] transport = new Vehicle[]{mercedes, scania, velaro, airbus, maglev, boeing};
        for (Vehicle vehicle : transport) {
            System.out.println(vehicle);
            vehicle.move();
            vehicle.getRefuelingCost();
        }
    }
}
