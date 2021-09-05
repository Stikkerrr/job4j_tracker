package ru.job4j.io;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class MagicBall {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        while (!"exit".equals(in.next())) {
            in.nextLine();
            int answer = new Random().nextInt(3);
            switch (answer) {
                case 1 -> System.out.println("Да");
                case 0 -> System.out.println("Нет");
                default -> System.out.println("Может быть");
            }
        }
    }
}
