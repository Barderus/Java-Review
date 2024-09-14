package OOP.Encapsulation;

public class Book {

    private String title;
    private String author;
    private int copies;
    private boolean inStock;

    Book(String title, String author, int copies, boolean inStock){
        this.setAuthor(author);
        this.setTitle(title);
        this.setCopies(copies);
        this.setInStock(inStock);
    }

    // Getter methods
    public String getTitle(){
        return  this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public int getCopies(){
        return this.copies;
    }

    public boolean getInStock(){
        return this.inStock;
    }

    // Setter methods
    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setCopies(int copies){
        this.copies = copies;
    }

    public void setInStock(boolean inStock){
        this.inStock = inStock;
    }
    
    @Override
    public String toString(){
        return "\nTitle: " + title +
                "\nAuthor: " + author +
                "\nCopies: " + copies +
                "\nIn stock: " + inStock;
    }


}
