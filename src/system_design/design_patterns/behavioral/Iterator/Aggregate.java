package system_design.design_patterns.behavioral.Iterator;

import java.util.Iterator;

public interface Aggregate {
    Iterator<Book> createIterator();
}
