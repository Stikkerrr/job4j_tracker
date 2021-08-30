package ru.job4j.pojo;

import java.time.LocalDateTime;
import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student vlad = new Student();
        vlad.setFamilyName("Иванов");
        vlad.setName("Иван");
        vlad.setSurname("Иванович");
        vlad.setGroup("Оптотехника");
        vlad.setReceiptDate(LocalDateTime.now());
        System.out.println(vlad.getName() + "\n"
                            + vlad.getSurname() + "\n"
                            + vlad.getFamilyName() + "\n"
                            + vlad.getGroup() + "\n"
                            + vlad.getReceiptDate());
    }
}
