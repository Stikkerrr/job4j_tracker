package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static void main(String[] args) {
        List<Integer> usage = new ArrayList<>() {{
            add(28);
            add(-72);
            add(33);
            add(-7);
            add(512);
        }};
        List<Integer> total = usage.stream()
                .filter(integer -> integer > 0)
                .collect(Collectors.toList());
    }
}
