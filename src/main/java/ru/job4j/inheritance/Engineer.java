package ru.job4j.inheritance;

import java.util.Date;

public class Engineer extends Profession {
    private int completedProjects;

    public Engineer(String name, String surname, String education, Date birthday,
                    int completedProjects) {
        super(name, surname, education, birthday);
        this.completedProjects = completedProjects;
    }

    public void analyzeTermsOfReference() {

    }
}
