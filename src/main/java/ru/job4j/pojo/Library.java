package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book[] books = new Book[4];
        for (int index = 0; index < books.length; index++) {
            books[index] = new Book();
        }
        books[0].setName("Clean code");
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].getName());
        }
        Book temp = books[3];
        books[3] = books[0];
        books[0] = temp;
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].getName());
        }
        for (Book book : books) {
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName());
            }
        }
    }
}
