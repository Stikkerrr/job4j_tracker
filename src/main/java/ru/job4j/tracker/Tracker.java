package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public List<Item> findAll() {
        return List.copyOf(items);
    }

    public List<Item> findByName(String key) {
        List<Item> sameNameItems = new ArrayList<>();
        for (Item item : items) {
            if (key.equals(item.getName())) {
                sameNameItems.add(item);
            }
        }
        return sameNameItems;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean resultSearch = index != -1;
        if (resultSearch) {
            item.setId(id);
            items.set(index, item);
        }
        return resultSearch;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean resultSearch = index != -1;
        if (resultSearch) {
            items.remove(index);
        }
        return resultSearch;
    }
}
