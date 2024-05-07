package system_design.design_patterns.behavioral.Iterator;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Book> books = List.of(
                new Book("Science", 10),
                new Book("Math", 20),
                new Book("History", 30),
                new Book("Football", 40)
        );

        Library library = new Library(books);
        Iterator<Book> iterator = library.createIterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book);
        }

        System.out.println("--------------Reverse-----------------");

        LibraryReverse libraryReverse = new LibraryReverse(books);
        iterator = libraryReverse.createIterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book);
        }

    }
}
