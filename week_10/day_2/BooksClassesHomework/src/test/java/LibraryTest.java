import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {
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
    //Write a method to count the number of books in the library.
    @Test

    public void countNumberOfBooks(){
        assertEquals(0, library.bookCount());

    }
    //Write a method to add a book to the library stock.
    @Test
    public void canAddBook(){
        library.add(book);
        assertEquals(1, library.bookCount());
    }

}