package ru.job4j.oop;

public abstract class Villain {

    private final String name;

    public Villain(String name) {
        this.name = name;
    }

    /**
     * Checks the possibility of eating
     *
     * @param ball eaten object
     * @return description of the result of the attempt
     */
    public String tryEat(Ball ball) {
        return ball.checkTypeVillain(this) ? this.name + " ate ball" : "The ball rolled away";
    }
}
