package system_design.design_patterns.behavioral.Iterator;

import java.util.Iterator;

public interface BookAggregate {
    Iterator<Book> createIterator();
}
