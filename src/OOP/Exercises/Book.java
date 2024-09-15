/*
    Library System with Aggregation
Create a Book class with fields title, author, and ISBN.
Create a Library class with a collection of Book objects (e.g., using an array or ArrayList).
Implement methods to add books, remove books, and list all books in the library.
 */
package OOP.Exercises;

public class Book {
    String title;
    String author;
    String ISBN;

    public Book(String title, String author, String ISBN){
        super();

        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    @Override
    public String toString(){
        return String.format("%-30s %-20s %-15s", title, author, ISBN);

    }
}
