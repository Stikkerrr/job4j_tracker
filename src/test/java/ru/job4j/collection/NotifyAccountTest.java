package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NotifyAccountTest {

    @Test
    public void sent() {
        List<Account> accounts = List.of(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                List.of(
                        new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("142", "Petr Arsentev", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void whenDuplicateRemove() {
        List<Account> accounts = List.of(
                new Account("1234", "Ivan Ivanovich Ivanov", "000001"),
                new Account("4321", "Petr Petrovich Petrov", "000010"),
                new Account("1234", "Ivan Ivanovich Ivanov", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                List.of(
                        new Account("1234", "Ivan Ivanovich Ivanov", "000001"),
                        new Account("4321", "Petr Petrovich Petrov", "000010")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }
}
