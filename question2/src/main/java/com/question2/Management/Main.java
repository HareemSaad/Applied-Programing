package com.question2.Management;

import com.question2.Library.Book;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("Book 1");
        book1.setAuthor("Author 1");
        book1.displayBookInfo();

        Book book2 = new Book("Book 2", "Author 2");
        book2.displayBookInfo();

        Book book3 = new Book("Book 3", "Author 3");
        book3.displayBookInfo();

        System.out.println("Total number of books: " + Book.getTotalBooks());

        com.question2.Library.Library library = new com.question2.Library.Library("Library 1", 3);
        library.displayLibraryInfo();
    }
}
