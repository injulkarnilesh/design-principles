package DEPENDENCY_INJECTION.example.fix;

import java.util.Arrays;
import java.util.List;

public class BooksCSVService implements BookService {
    @Override
    public List<Book> getAll() {
        return Arrays.asList();
    }
}
