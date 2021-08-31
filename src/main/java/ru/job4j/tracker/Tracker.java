package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        Item[] onlyItems = new Item[size];
        int index = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                onlyItems[index++] = items[i];
                if (index == size) {
                    break;
                }
            }
        }
        return onlyItems;
    }

    public Item[] findByName(String key) {
        Item[] sameNameItems = new Item[size];
        int allItemsIndex = 0;
        int resultIndex = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                allItemsIndex++;
                if (key.equals(items[i].getName())) {
                    sameNameItems[resultIndex++] = items[i];
                }
                if (allItemsIndex == size) {
                    break;
                }
            }
        }
        sameNameItems = Arrays.copyOf(sameNameItems, resultIndex);
        return sameNameItems;
    }
}
