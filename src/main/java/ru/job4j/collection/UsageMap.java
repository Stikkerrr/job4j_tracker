package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {

    public static void main(String[] args) {
        HashMap<String, String> accountDirectory = new HashMap<>();
        accountDirectory.put("thisIsMail@gmail.com", "Ivanov Ivan");
        for (String key : accountDirectory.keySet()) {
            String value = accountDirectory.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
