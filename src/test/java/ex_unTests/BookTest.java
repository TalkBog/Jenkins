package ex_unTests;
import ex_un.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

class BookTest {
    @Test
    void GetConstructorTest(){
        Book book = new Book("pipou", "robert", "10/11/2022");
        Assertions.assertEquals("pipou", book.getTitle());
        Assertions.assertEquals("robert" , book.getAuthor());
        Assertions.assertEquals("10/11/2022", book.getDate());
    }

    @Test
    void SetTest(){
        Book book = new Book("pipou", "robert", "10/11/2022");
        book.setTitle("gerard");
        Assertions.assertEquals("gerard" , book.getTitle());
        book.setAuthor("bernard");
        Assertions.assertEquals("bernard", book.getAuthor());
        book.setDate("11/12/2070");
        Assertions.assertEquals("11/12/2070", book.getDate());
    }
}
