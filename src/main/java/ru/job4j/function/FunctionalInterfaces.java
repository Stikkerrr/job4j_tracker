package ru.job4j.function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biCon = (integer, string) -> map.put(integer, string);
        biCon.accept(1, "one");
        biCon.accept(2, "two");
        biCon.accept(3, "three");
        biCon.accept(4, "four");
        biCon.accept(5, "five");
        biCon.accept(6, "six");
        biCon.accept(7, "seven");

        BiPredicate<Integer, String> biPred =
                (integer, string) -> integer % 2 == 0 || string.length() == 4;
        for (Integer integer : map.keySet()) {
            if (biPred.test(integer, map.get(integer))) {
                System.out.println("key: " + integer + " value: " + map.get(integer));
            }
        }
        Supplier<List<String>> sup = () -> new ArrayList<>(map.values());
        List<String> strings = new ArrayList<>(map.values());

        Consumer<String> con = (string) -> System.out.println(string);
        Function<String, String> func = string -> string.toUpperCase();
        for (String s : strings) {
            con.accept(func.apply(s));
        }
    }
}
