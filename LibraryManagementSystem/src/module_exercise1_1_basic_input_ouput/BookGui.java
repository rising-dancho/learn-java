package module_exercise1_1_basic_input_ouput;

import javax.swing.JOptionPane;

/**
 * Perez Jr., Jose A.
 * BSIT-IT12S4
 * Date: 2/19/25
 * Week:
 * Topic: GUI Input and Output in Java
 */

public class BookGui {
    // class attributes
    private int bookId;
    private String title;
    private String ISBN;
    private String category;

    // constructor
    public BookGui(int bookId, String title, String ISBN, String category) {
        this.bookId = bookId;
        this.title = title;
        this.ISBN = ISBN;
        this.category = category;
    }

    // display using JOptionPane
    public void displayBookInfo() {
        String message =
                        "book id: " + bookId + "\n" +
                        "title: " + title + "\n" +
                        "isbn: " + ISBN + "\n" +
                        "category: " + category;

        JOptionPane.showMessageDialog(null, message, "book details", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        int bookId = Integer.parseInt(JOptionPane.showInputDialog("enter book id:"));
        String title = JOptionPane.showInputDialog("enter book title:");
        String ISBN = JOptionPane.showInputDialog("enter isbn:");
        String category = JOptionPane.showInputDialog("enter category:");


        BookGui book = new BookGui(bookId, title, ISBN, category);
        book.displayBookInfo();
    }
}
