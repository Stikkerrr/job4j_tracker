package ru.job4j.inheritance;

import java.util.Date;

public class Builder extends Engineer {
    private int constructedBuildings;

    public Builder(String name, String surname, String education, Date birthday,
                   int completedProjects, int constructedBuildings) {
        super(name, surname, education, birthday, completedProjects);
        this.constructedBuildings = constructedBuildings;
    }

    public void studyTheConstructionScheme() {

    }
}
