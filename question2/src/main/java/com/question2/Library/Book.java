package com.question2.Library;

public class Book {
    private String title;
    private String author;
    private static int totalBooks = 0;
    
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        totalBooks++;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        totalBooks++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    public static int getTotalBooks() {
        return totalBooks;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}
