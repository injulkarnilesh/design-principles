package DEPENDENCY_INJECTION.example.violation;

import java.util.List;
import java.util.stream.Collectors;

public class BooksController {

    /*
    Direct dependency inside class.
    Changes in BookService would require changes in BooksController.
    We can not change implementation of BookService without code changes here.
     */
    private BooksCSVService bookService = new BooksCSVService();

    public List<Book> writenBy(String author) {
        return bookService.getAll()
                .stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

}
