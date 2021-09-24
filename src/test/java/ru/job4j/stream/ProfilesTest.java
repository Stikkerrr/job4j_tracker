package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void collect() {
        Address ivan = new Address("Moskva", "Tverskaya", 1, 1);
        Address petr = new Address("NewYork", "Fulton Street", 2, 1);
        Address misha = new Address("Berlin", "Rathausstrabe", 15, 1);
        List<Profile> addresses = List.of(
                new Profile(ivan),
                new Profile(petr),
                new Profile(misha)
        );
        Profiles pr = new Profiles();
        List<Address> rsl = pr.collect(addresses);
        List<Address> expected = List.of(
                ivan,
                petr,
                misha
        );
        assertThat(rsl, is(expected));
    }
}
