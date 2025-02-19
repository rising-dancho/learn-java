package module_exercise1_1_basic_input_ouput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Perez Jr., Jose A.
 * BSIT-IT12S4
 * Date: 2/19/25
 * Week:
 * Topic: Basic Input and Output in Java
 */

public class Book {
    // class attributes
    private int bookId;
    private String title;
    private String ISBN;
    private String category;

    // constructor
    public Book(int bookId, String title, String ISBN, String category) {
        this.bookId = bookId;
        this.title = title;
        this.ISBN = ISBN;
        this.category = category;
    }

    public void displayBookInfo() {
        System.out.println("\nbook details:");
        System.out.println("book id: " + bookId);
        System.out.println("title: " + title);
        System.out.println("isbn: " + ISBN);
        System.out.println("category: " + category);
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("enter book id: ");
            int bookId = Integer.parseInt(br.readLine());

            System.out.print("enter book title: ");
            String title = br.readLine();

            System.out.print("enter isbn: ");
            String ISBN = input.nextLine();

            System.out.print("enter category: ");
            String category = input.nextLine();

            Book book = new Book(bookId, title, ISBN, category);

            book.displayBookInfo();
            input.close();
        } catch (IOException e) {
            System.out.println("error: " + e);
        }
    }
}
