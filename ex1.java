class Book {
    int bookId;
    String title;
    String author;
    String category;
    int price;
    boolean available = true;

    Book(int b, String t, String a, String c, int p) {
        bookId = b;
        title = t;
        author = a;
        category = c;
        price = p;
    }

    void displayBookDetails() {
        System.out.println("Book ID     : " + bookId);
        System.out.println("Title       : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Category    : " + category);
        System.out.println("Price       : " + price);
        System.out.println("Available   : " + available);
        System.out.println("----------------------------");
    }
}

public class ex1 {
    public static void main(String[] args) {

        Book book1 = new Book(101, "Java Programming",
                "James Gosling", "Programming", 500);

        Book book2 = new Book(102, "Data Structures",
                "Mark Allen", "Computer Science", 450);

        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}