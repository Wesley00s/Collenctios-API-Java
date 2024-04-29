package list.search;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<Book> books;

    public Catalog() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }
    public List<Book> getBooks() {
        return books;
    }

    public List<Book> searchByAuthor(String query) {
        if(books.isEmpty()) {
            return null;
        }
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if(book.getAuthor().equalsIgnoreCase(query.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> searchByYear(int initialYear, int finalYear) {
        if(books.isEmpty()) {
            return null;
        }
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if(book.getPublisherYear() >= initialYear && book.getPublisherYear() <= finalYear) {
                result.add(book);
            }
        }
        return result;
    }

    public Book searchByTile(String title) {
        Book result = null;
        if(books.isEmpty()) {
            return null;
        }
        for (Book book : books) {
            if(book.getTitle().equalsIgnoreCase(title)) {
                result = book;
            }
        }
        return result;
    }
}
