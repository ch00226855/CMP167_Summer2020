public class Book {

    private String name = "1";

    public Book() {
        name = "2";
    }

    public String name(String x){
        return "3";
    }

    public static void main(String[] args) {
        Book myBook = new Book();
        String name = "4";
        System.out.println(myBook.name(name));
    }
}