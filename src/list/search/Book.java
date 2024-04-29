package list.search;

public class Book {
    private String title;
    private String author;
    private int publisherYear;

    public Book(String title, String author, int publisherYear) {
        this.title = title;
        this.author = author;
        this.publisherYear = publisherYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublisherYear() {
        return publisherYear;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }

    @Override
    public String toString() {
        return "Title: " + title +
                "\nAuthor" + author +
                "\nPublisher Year: " + publisherYear +
                "\n --------------------------------\n";
    }
}
