package INVERSION_OF_CONTROL.example.fix1;

import java.util.Arrays;
import java.util.List;

public class DatabaseMoviesProvider implements MoviesProvider {

    @Override
    public List<Movie> getAll() {
        return Arrays.asList();
    }

}
