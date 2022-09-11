package Task;

public class Main {
    private int yearPublication;

    public static void main(String[] args) {
        Author author1 = new Author("Barry", "Burd");
        Author author2 = new Author("Martin", "Robert");
        Author author3 = new Author("Eliezer", "Yudkowsky");

        Book book1 = new Book("Java For Dummies", author1, 2019);
        Book book2 = new Book("Clean Code", author2, 2010);
        Book book3 = new Book("Harry Potter and the Methods of Rationality", author3, 2015);

        System.out.println(book1.getNameBook() + " " + book1.getAuthorName() + " " + book1.getYearPublication());
        System.out.println(book2.getNameBook() + " " + book2.getAuthorName() + " " + book2.getYearPublication());
        System.out.println(book3.getNameBook() + " " + book3.getAuthorName() + " " + book3.getYearPublication());

        book2.setYearPublication(2022);
        System.out.println(book2.getNameBook() + " " + book2.getAuthorName() + " " + book2.getYearPublication());
    }

}

