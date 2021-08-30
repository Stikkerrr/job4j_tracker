package ru.job4j.inheritance;

import java.util.Date;

public class Doctor extends Profession {
    private int examinedPatients;

    public Doctor(String name, String surname, String education, Date birthday,
                  int examinedPatients) {
        super(name, surname, education, birthday);
        this.examinedPatients = examinedPatients;
    }

    public void diagnoseAPatient() {

    }
}
