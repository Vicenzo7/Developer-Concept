package system_design.design_patterns.behavioral.Iterator;

import java.util.Iterator;
import java.util.List;

public class Library implements BookAggregate {

    List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }


    @Override
    public Iterator<Book> createIterator() {
        return new BookIterator(books);
    }
}
