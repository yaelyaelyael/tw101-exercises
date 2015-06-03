package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;
import java.lang.String;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public void printBooksContaining(String partialBookTitle) { //unsure about return type here, is void okay? or String

        for(int i = 0; i < books.length; i++) {
            if (books[i].contains(partialBookTitle)) {
                printStream.print(books[i]);
                printStream.println();
            }
        }
        System.out.println();
        return;
    }
}
