package OOP.Encapsulation;

public class bookDemo {

    public static void main(String[] args) {

        Book book = new Book("Harry Potter", "J.K Rowling", 5, true);

        System.out.println(book.getTitle());
        book.setInStock(false);
        System.out.println(book);
    }
}
