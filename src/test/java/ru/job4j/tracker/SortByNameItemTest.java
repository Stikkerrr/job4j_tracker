package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortByNameItemTest {

    @Test
    public void whenNamesAreEqual() {
        SortByNameItem sort = new SortByNameItem();
        int result = sort.compare(new Item("Vlad"), new Item("Vlad"));
        assertThat(result, is(0));
    }

    @Test
    public void whenSortByAscendOrder() {
        Item item1 = new Item(1, "My");
        Item item2 = new Item(2, "First");
        Item item3 = new Item(3, "Job");
        List<Item> items = Arrays.asList(item1, item2, item3);
        List<Item> expect = Arrays.asList(item2, item3, item1);
        items.sort(new SortByNameItem());
        assertEquals(items, expect);
    }

    @Test
    public void whenSortByDescendOrder() {
        Item item1 = new Item(1, "My");
        Item item2 = new Item(2, "Second");
        Item item3 = new Item(3, "Job");
        List<Item> items = Arrays.asList(item1, item2, item3);
        List<Item> expect = Arrays.asList(item2, item1, item3);
        items.sort(new SortByNameItem().reversed());
        assertEquals(items, expect);
    }
}
