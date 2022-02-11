import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BooksTest {

    Library library;
    Book book;
    Book book1;
    Book book2;
    @Before
    public void before() {
        library = new Library();
        book = new Book("Lotr", "Tolkien", "fiction");
        book1 = new Book("Hobit", "Tolkien", "fiction");
        book2 = new Book("Silmallirion", "Tolkien", "fiction");

    }

    @Test

    public void bookHasTitle(){
        assertEquals("Lotr", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Tolkien", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("fiction", book.getGenre());
    }
    //Write a method to count the number of books in the library.




}
