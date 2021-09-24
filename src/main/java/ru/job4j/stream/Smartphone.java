package ru.job4j.stream;

public class Smartphone {
    private String name;
    private String brand;
    private String processor;
    private String os;
    private int ram;
    private int numberCameras;
    private int chargingPower;
    private boolean miniJack;
    private boolean chargerIncluded;
    private boolean notch;

    static class Builder {
        private String name;
        private String brand;
        private String processor;
        private String os;
        private int ram;
        private int numberCameras;
        private int chargingPower;
        private boolean miniJack;
        private boolean chargerIncluded;
        private boolean notch;

        Builder buildName(String name) {
            this.name = name;
            return this;
        }

        Builder buildBrand(String brand) {
            this.brand = brand;
            return this;
        }

        Builder buildProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        Builder buildOs(String os) {
            this.os = os;
            return this;
        }

        Builder buildRam(int ram) {
            this.ram = ram;
            return this;
        }

        Builder buildCamera(int numberCameras) {
            this.numberCameras = numberCameras;
            return this;
        }

        Builder buildChargingPower(int chargingPower) {
            this.chargingPower = chargingPower;
            return this;
        }

        Builder buildMiniJack(boolean miniJack) {
            this.miniJack = miniJack;
            return this;
        }

        Builder buildChargerIncluded(boolean chargerIncluded) {
            this.chargerIncluded = chargerIncluded;
            return this;
        }

        Builder buildNotch(boolean notch) {
            this.notch = notch;
            return this;
        }

        Smartphone build() {
            Smartphone smartphone = new Smartphone();
            smartphone.name = name;
            smartphone.brand = brand;
            smartphone.processor = processor;
            smartphone.os = os;
            smartphone.ram = ram;
            smartphone.numberCameras = numberCameras;
            smartphone.chargingPower = chargingPower;
            smartphone.miniJack = miniJack;
            smartphone.chargerIncluded = chargerIncluded;
            smartphone.notch = notch;
            return smartphone;
        }
    }

    @Override
    public String toString() {
        return "PC " + "{" + System.lineSeparator()
                + " name: " + name + "," + System.lineSeparator()
                + " brand: " + brand + "," + System.lineSeparator()
                + " processor: " + processor + "," + System.lineSeparator()
                + " os: " + os + "," + System.lineSeparator()
                + " ram: " + ram + "," + System.lineSeparator()
                + " numberCameras: " + numberCameras + "," + System.lineSeparator()
                + " chargingPower: " + chargingPower + "," + System.lineSeparator()
                + " miniJack: " + miniJack + "," + System.lineSeparator()
                + " chargerIncluded: " + chargerIncluded + "," + System.lineSeparator()
                + " notch: " + notch + "," + System.lineSeparator()
                + "}";
    }

    public static void main(String[] args) {
        Smartphone smartphone = new Builder()
                .buildName("6")
                .buildBrand("OnePlus")
                .buildProcessor("Snapdragon 845")
                .buildOs("Android")
                .buildRam(8)
                .buildCamera(2)
                .buildChargingPower(20)
                .buildMiniJack(true)
                .buildChargerIncluded(true)
                .buildNotch(true)
                .build();
        System.out.println(smartphone);
    }
}
