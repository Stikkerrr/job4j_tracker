package ru.job4j.inheritance;

import java.util.Date;

public class Surgeon extends Doctor {
    private int numberOfOperations;

    public Surgeon(String name, String surname, String education, Date birthday,
                   int examinedPatients, int numberOfOperations) {
        super(name, surname, education, birthday, examinedPatients);
        this.numberOfOperations = numberOfOperations;
    }

    public void performSurgicalOperation() {

    }
}
