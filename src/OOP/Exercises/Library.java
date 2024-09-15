/*
    Library System with Aggregation
Create a Book class with fields title, author, and ISBN.
Create a Library class with a collection of Book objects (e.g., using an array or ArrayList).
Implement methods to add books, remove books, and list all books in the library.
 */

package OOP.Exercises;

import java.util.ArrayList;

public class Library{

    ArrayList<Book> booksList;

    public Library(ArrayList<Book> bookList){
        this.booksList = bookList;
    }

    public void addBooks(String title, String author, String isbn){

        Book book = new Book(title, author, isbn);
        this.booksList.add(book);

    }

    public void removeBooks(String title){

        // Check if the book with a matching title exists in the list
        Book bookToRemove = null;
        for (Book book : booksList) {
            if (book.title.equals(title)) {
                bookToRemove = book;
                break;
            }
        }

        // If the book is found, remove it from the list
        if (bookToRemove != null) {
            booksList.remove(bookToRemove);
            System.out.println(title + " has been removed from our collection.");
        } else {
            System.out.println(title + " does not exist in our collection.");
        }
    }

    public void displayBooks(){
        System.out.printf("%-30s %-20s %-15s%n", "Title", "Author", "ISBN");
        for(Book s : this.booksList){
            System.out.println(s);
        }


    }
}
