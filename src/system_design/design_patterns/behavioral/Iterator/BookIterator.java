package system_design.design_patterns.behavioral.Iterator;

import java.util.Iterator;
import java.util.List;

public class BookIterator implements Iterator<Book> {

    List<Book> books;

    int index;

    public BookIterator(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return index < books.size();
    }

    @Override
    public Book next() {
        if (hasNext()) {
            return books.get(index++);
        }
        return null;
    }
}
