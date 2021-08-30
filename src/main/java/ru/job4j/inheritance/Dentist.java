package ru.job4j.inheritance;

import java.util.Date;

public class Dentist extends Doctor {
    private int numberOfJawImpressions;

    public Dentist(String name, String surname, String education, Date birthday,
                   int examinedPatients, int numberOfJawImpressions) {
        super(name, surname, education, birthday, examinedPatients);
        this.numberOfJawImpressions = numberOfJawImpressions;
    }

    public void makeImpressionOfJaw() {

    }
}
