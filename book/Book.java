package FullPractice.book;

class Book {

    String title;
    String author;

    public Book() {
        this.title = "More Than a Crown";
        this.author = "Celie";
    }

    public Book(String title, String author) {

        if (title == null || title.trim().isEmpty()) {
            this.title = "More Than a crown";
        } else {
            this.title = title;
        }

        if (author == null || author.trim().isEmpty()) {
            this.author = "Celie";
        } else {
            this.author = author;
        }
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

