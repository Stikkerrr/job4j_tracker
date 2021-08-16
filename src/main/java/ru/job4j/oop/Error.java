package ru.job4j.oop;

import java.util.List;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Активность ошибки: " + active);
        System.out.println("Статус ошибки " + status);
        System.out.println("Сообщение об ошибке " + message);
    }

    public static void main(String[] args) {
        List<Error> errors = List.of(
                new Error(),
                new Error(true, 404, "test"),
                new Error(true, 200, "first message"),
                new Error(false, 502, "last message"));
        errors.forEach(Error::printInfo);
    }
}
