package ru.job4j.lambda;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CountingRangeTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        CountingRange function = new CountingRange();
        List<Double> result = function.diapason(2, 8, x -> 2 * x);
        List<Double> expected = Arrays.asList(4D, 6D, 8D, 10D, 12D, 14D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        CountingRange function = new CountingRange();
        List<Double> result = function.diapason(1, 3, x -> x * x);
        List<Double> expected = Arrays.asList(1D, 4D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenExponentialResults() {
        CountingRange function = new CountingRange();
        List<Double> result = function.diapason(10, 13, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(1024D, 2048D, 4096D);
        assertThat(result, is(expected));
    }
}
