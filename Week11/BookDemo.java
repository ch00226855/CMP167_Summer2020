public class BookDemo {

    public static void main(String[] args) {
        
        // Book book1 = new Book();
        // Book book2 = new Book();

        // // Pass the information to the books.
        // book1.name = "Harry Porter";
        // book1.author = "J. K. Rowling";
        // book1.numPages = 300;
        // book1.price = 20.00;

        // book2.name = "The Great Gatsby";
        // book2.author = "F. Scott Fitzgerald";
        // book2.numPages = 350;
        // book2.price = 15.99;

        // System.out.println("Book1 - Name: " + book1.name +
        //      " - Author: " + book1.author);
        // // Print the name and author of the second book
        // System.out.println("Book2 - Name: " + book2.name +
        //      " - Author: " + book2.author);
        // book1.printInfo();
        // book2.printInfo();

        // Create book objects using constructors
        // invoke default constructor
        Book book1 = new Book(); 
        book1.printInfo();
        // invoke the overloaded constuctor
        Book book2 = new Book("The Great Gatsby",
                        "F. Scott Fitzgerald",
                        350, 14.99);
        book2.printInfo();
        // we don't want values to be changed.
        // book2.name = "The Pityful Gatsby";
        // book2.printInfo();
        book2.setPrice(10.99);
        book2.printInfo();
        book1.setPrice(20.00);
        book1.printInfo();
        // change book1's numPages to 300.
        book1.setNumPages(300);

        // Use getters to print the name 
        // and author
        System.out.println(book2.getName() + 
         " " + book2.getAuthor());

         // Print numPages and price

         // create a 20% discount on book2
        book2.onSale(0.2);
        book2.printInfo();

        // Call toString and print
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        
        Book book3 = new Book("The Great Gatsby",
                            "F. Scott Fitzgerald",
                            350,
                            14.99);
        System.out.println(book2.equals(book3));

    }
    
}