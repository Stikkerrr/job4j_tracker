package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {

    public static void main(String[] args) {
        HashMap<String, String> accountDirectory = new HashMap<>() {{
            put("thisIsMail@gmail.com", "Ivanov Ivan");
        }};
        accountDirectory.forEach((key, value) -> System.out.println(key + " = " + value));
    }
}
