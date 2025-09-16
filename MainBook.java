import java.util.ArrayList;

class Book {
    String title, author, ISBN;
    static ArrayList<Book> collection = new ArrayList<>();

    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    void addBook() {
        collection.add(this);
    }

    void removeBook() {
        collection.remove(this);
    }

    void printBook() {
        System.out.println(title + " by " + author + ", ISBN: " + ISBN);
    }

    static void printCollection() {
        System.out.println("List of books:");
        for (Book b : collection)
            b.printBook();
    }
}

public class MainBook {
    public static void main(String[] args) {
        Book b1 = new Book("The C Programming Language", "Dennis Ritchie, Brian Kernighan", "9780131101630");
        Book b2 = new Book("An Introduction to Python", "Guido van Rossum", "9355423489");

        b1.addBook();
        b2.addBook();
        Book.printCollection();

        System.out.println("\nAfter removing The C Programming Language:");
        b1.removeBook();
        Book.printCollection();
    }
}
