package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenPoint10ToPoint47ThenDistance7211() {
        Point a = new Point(0, 1);
        Point b = new Point(4, 7);
        double ab = a.distance(b);
        assertThat(ab, closeTo(7.211, 0.001));
    }

    @Test
    public void whenPoint018ToPoint47min3ThenDistance13152() {
        Point a = new Point(0, 1, 8);
        Point b = new Point(4, 7, -3);
        double ab = a.distance3d(b);
        assertThat(ab, closeTo(13.152, 0.001));
    }
}
