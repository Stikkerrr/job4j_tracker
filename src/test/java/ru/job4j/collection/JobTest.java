package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {

    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName()
                .thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("I", 0),
                new Job("F", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorAscByName() {
        Comparator<Job> cmpAscName = new JobAscByName();
        int rsl = cmpAscName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorDescByName() {
        Comparator<Job> cmpAscName = new JobDescByName();
        int rsl = cmpAscName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorDescByPriority() {
        Comparator<Job> cmpAscName = new JobDescByPriority();
        int rsl = cmpAscName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorAcsByPriority() {
        Comparator<Job> cmpAscName = new JobAscByPriority();
        int rsl = cmpAscName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorDescByNameAndAcsByPriority() {
        Comparator<Job> cmpAscName = new JobDescByName().thenComparing(new JobAscByPriority());
        int rsl = cmpAscName.compare(
                new Job("Fix bug", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorIsEquals() {
        Comparator<Job> cmpAscName = new JobDescByName().thenComparing(new JobAscByPriority());
        int rsl = cmpAscName.compare(
                new Job("Fix bug", 0),
                new Job("Fix bug", 0)
        );
        assertThat(rsl, is(0));
    }
}
