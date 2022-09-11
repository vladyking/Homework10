package Task;

import java.util.Objects;

public class Book {

    private final String nameBook;
    private final Author authorName;
    private int yearPublication;

    public Book(String nameBook, Author authorName, int yearPublication) {
        this.nameBook = nameBook;
        this.authorName = authorName;
        this.yearPublication = yearPublication;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return nameBook + authorName + yearPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && nameBook.equals(book.nameBook) && authorName.equals(book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, authorName, yearPublication);
    }
}