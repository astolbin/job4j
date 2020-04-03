package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];

        books[0] = new Book("Harry Potter and the Prisoner of Azkaban", 400);
        books[1] = new Book("Design Patterns", 500);
        books[2] = new Book("Clean Code", 600);
        books[3] = new Book("The Lord of the Rings: The Two Towers", 700);

        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getPages());
        }

        System.out.println("Swap 0 and 3");

        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;

        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getPages());
        }

        System.out.println("Show only Clean Code");

        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.getName().equals("Clean Code")) {
                System.out.println(book.getName() + " - " + book.getPages());
            }
        }
    }
}
