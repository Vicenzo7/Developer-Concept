package system_design.design_patterns.behavioral.Iterator;

import java.util.Iterator;
import java.util.List;

public class LibraryReverse implements Aggregate {

    List<Book> books;

    public LibraryReverse(List<Book> books) {
        this.books = books;
    }


    @Override
    public Iterator<Book> createIterator() {
        return new BookIteratorReverse(books);
    }
}
