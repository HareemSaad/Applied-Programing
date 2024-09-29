package com.question2.Library;

public class Library {
    private String libraryName;
    private int numberOfBooks;

    public Library() {
        this.libraryName = "Unnamed Library";
        this.numberOfBooks = 0;
    }

    public Library(String libraryName, int numberOfBooks) {
        this.libraryName = libraryName;
        this.numberOfBooks = numberOfBooks;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public void displayLibraryInfo() {
        System.out.println("Library Name: " + libraryName + ", Number of Books: " + numberOfBooks);
    }
}
