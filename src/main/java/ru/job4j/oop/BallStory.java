package ru.job4j.oop;
import java.util.List;

public class BallStory {

    public static void main(String[] args) {
        Ball ball = new Ball();
        List<Villain> villains = List.of(new Hare(), new Wolf(), new Fox());
        villains.forEach(villain -> System.out.println(villain.tryEat(ball)));
    }
}
