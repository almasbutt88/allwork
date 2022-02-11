public class Book {

    private String title;
    private String author;
    private String genre;


    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }


    public String getTitle() { //this is a getter
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int add(Book book) {
        return add(book);
    }
    //dont need a setter here because book title isnt likely to change
}
