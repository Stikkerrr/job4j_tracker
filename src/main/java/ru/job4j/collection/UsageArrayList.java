package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {

    public static void main(String[] args) {
        ArrayList<String> namesCollection = new ArrayList<String>() {{
            add("Petr");
            add("Ivan");
            add("Stepan");
        }};
        namesCollection.forEach(System.out::println);
    }
}
