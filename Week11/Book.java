/*
 Define a Book class with member variable name, author, number of pages, and price.
 */
public class Book {
    // ---- private fields ----
    private String name; // global variable / global field / global member variables
    private String author;
    private int numPages;
    private double price;

    // ---- Constructor method ------
    // initialize all global fields
    public Book() {
        // default constructor.
        name = "UNDEFINED";
        author = "UNDEFINED";
        numPages = -1;
        price = -1.0;
    }

    public Book(String bookName,
                String bookAuthor,
                int bookNumPages,
                double bookPrice) {
        // overloaded constructor.
        name = bookName;
        author = bookAuthor;
        numPages = bookNumPages;
        price = bookPrice;
    }

    //------ Setters ------
    // Also called mutators
    public void setPrice(double newPrice) {
        if (newPrice < 0.0) {
            System.out.println("Invalid price.");
            return;
        }
        price = newPrice;
    }

    public void setNumPages(int newNumPages) {
        // if (newNumPages <= 0) {
        //     System.out.println("Invalid numPages.");
        //     return;
        // }
        if(invalidNumPages(newNumPages)){
            return;
        }
        numPages = newNumPages;
    }

    private boolean invalidNumPages(int x) {
        if (x <= 0) {
            System.out.println("Invalid numPages.");
            return true;
        }
        return false;
    }

    // --- Getter methods -----
    // also called accessors
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    // Define getNumPages and getPrice
    public int getNumPages(){
        return numPages;
    }

    public double getPrice(){
        return price;
    }


    public void printInfo() {
        System.out.printf("Name: " +
            name + " - Price: %.2f\n", 
            price);
    }

    public void onSale(double discount) {
        price = price * (1 - discount);
    }

    // Very important methods:
    public String toString() {
    // returns a string that descirbes the object
        // String output = name + author + numPages
        //                 + price;
        // Use String.format() to create a better one
        String output = String.format("Book name: %20s | Author: %20s |" +
            " Number of Pages: %03d | Price: %.2f", name, author,
            numPages, price);
        return output;
    }

    // the equals methods checks if another object is the same as this one.
    public boolean equals(Object obj) {
    // check if obj is an instance of a Book
        if(obj instanceof Book) {
    // For books, two objects are considered equal
    // if they have the same name, the same author,
    // and the same number of pages.
            Book otherBook = (Book) obj;
            if (name.equals(otherBook.getName())){
                if (author.equals(otherBook.getAuthor())) {
                    if (numPages == otherBook.getNumPages()) {
                        return true;
                    }
                }
            }

        }
        return false;




    }


}