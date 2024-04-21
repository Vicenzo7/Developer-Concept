package system_design.design_patterns.behavioral.Iterator;

import java.util.Iterator;
import java.util.List;

public class BookIteratorReverse implements Iterator<Book> {

    List<Book> books;

    int index;

    public BookIteratorReverse(List<Book> books) {
        this.books = books;
        if (books != null) {
            index = books.size() - 1;
        }
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public Book next() {
        if (hasNext()) {
            return books.get(index--);
        }
        return null;
    }
}
