package ru.job4j.collection;

import java.util.HashSet;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<>() {{
            add("Lada");
            add("BMW");
            add("Volvo");
            add("Toyota");
        }};
        for (String auto : autos) {
            System.out.println(auto);
        }
    }
}
