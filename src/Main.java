import java.util.*;
class Author {
    private String name;
    private String nationality;

    // Constructor
    public Author(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }
}

// Class to represent a Book
class Book {
    private String title;
    private Author author; // Has-A relationship: Book "has" an Author

    // Constructor
    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }
}

// Class to represent a Library
class Library {
    private String name;
    private List<Book> books; // Has-A relationship: Library "has" many Books

    // Constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display all books in the library
    public void displayBooks() {
        System.out.println("Books in " + name + " Library:");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor().getName());
        }
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Creating authors
        Author author1 = new Author("J.K. Rowling", "British");
        Author author2 = new Author("George Orwell", "British");

        // Creating books
        Book book1 = new Book("Harry Potter", author1);
        Book book2 = new Book("1984", author2);
        Book book3 = new Book("rich dad and poor dad", author1 );

        // Creating library
        Library library = new Library("Central");

        // Adding books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Displaying library books
        library.displayBooks();
    }
}