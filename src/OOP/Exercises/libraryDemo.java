/*
    Library System with Aggregation
Create a Book class with fields title, author, and ISBN.
Create a Library class with a collection of Book objects (e.g., using an array or ArrayList).
Implement methods to add books, remove books, and list all books in the library.
 */

package OOP.Exercises;

import java.util.ArrayList;

public class libraryDemo {

    public static void main(String[] args) {

        // Initialize the ArrayList
        ArrayList<Book> booksList = new ArrayList<Book>();
        Library lib = new Library(booksList);

        // Sample data
        String[] titles = {
                "The Great Adventure", "Mystery of the Old House", "Journey to the Unknown",
                "Science of Everything", "History Unfolded", "World of Fantasy",
                "Secrets of the Universe", "Art of Coding", "Gardening for Beginners",
                "Exploring Space", "Mind and Body", "The Modern Chef",
                "Digital Artistry", "The Road to Success", "Fitness Fundamentals",
                "Learning Java", "Design Patterns", "Travel Diaries",
                "The Book Thief", "Programming in Python"
        };

        String[] authors = {
                "John Doe", "Jane Smith", "Robert Brown",
                "Emily White", "Michael Green", "Alice Black",
                "Chris Blue", "Nancy Grey", "Tom Wilson",
                "Lucy Adams", "Mark Scott", "Clara Johnson",
                "Andrew Lee", "Sophia Turner", "Jack King",
                "William Wright", "Mary Taylor", "Lucas Harris",
                "Jessica Martinez", "Olivia Anderson"
        };

        String[] isbns = {
                "978-1-123456-01-1", "978-1-123456-02-8", "978-1-123456-03-5",
                "978-1-123456-04-2", "978-1-123456-05-9", "978-1-123456-06-6",
                "978-1-123456-07-3", "978-1-123456-08-0", "978-1-123456-09-7",
                "978-1-123456-10-3", "978-1-123456-11-0", "978-1-123456-12-7",
                "978-1-123456-13-4", "978-1-123456-14-1", "978-1-123456-15-8",
                "978-1-123456-16-5", "978-1-123456-17-2", "978-1-123456-18-9",
                "978-1-123456-19-6", "978-1-123456-20-2"
        };

        for(int index = 0; index < titles.length; index++){
            Book book = new Book(titles[index], authors[index], isbns[index]);
            booksList.add(book);
        }

        lib.addBooks("Harry Potter and The Sorcerer Stone", "J.K Rowling", "978-1-123999-09-1");
        lib.displayBooks();
        lib.removeBooks("Harry Potter and The Sorcerer Stone");
        lib.displayBooks();


    }
}
