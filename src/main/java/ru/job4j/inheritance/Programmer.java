package ru.job4j.inheritance;

import java.util.Date;

public class Programmer extends Engineer {
    private int completedProjects;

    public Programmer(String name, String surname, String education, Date birthday,
                      int completedProjects, int completedProjects1) {
        super(name, surname, education, birthday, completedProjects);
        this.completedProjects = completedProjects1;
    }

    public void chooseTechnologyImplementation() {

    }
}
