package OOP_PRINCIP.homework2.task3;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Book {
    private final String isbn;
    private final String title;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        return "Book{isbn='" + isbn + "', title='" + title + "'}";
    }

    public static void main(String[] args) {
        Set<Book> books = new HashSet<>();
        Book book1 = new Book("978-3-16", "Война и мир");
        Book book2 = new Book("978-3-16", "Анна Карелина");

        books.add(book1);
        books.add(book2);

        System.out.println(books.size());
        System.out.println(books);
    }
}