package DEPENDENCY_INJECTION.example.fix;

import java.util.List;
import java.util.stream.Collectors;

public class BooksController {

    private final BookService bookService;

    /*
    Dependency injected into this class from outside.
    Dependency is in abstraction.
    Implementation can be changed without changes in this class.
     */
    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }

    public List<Book> writenBy(String author) {
        return bookService.getAll()
                .stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

}
