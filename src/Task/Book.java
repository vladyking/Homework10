package Task;

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
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", author=" + authorName +
                ", yearPublication=" + yearPublication +
                '}';
    }
}