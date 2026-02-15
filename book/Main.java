package FullPractice.book;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Java OOP", "Celie");
        book1.displayInfo();

        Book book2 = new Book("", null);
        book2.displayInfo();

        Book book3 = new Book();
        book3.displayInfo();
    }
}
