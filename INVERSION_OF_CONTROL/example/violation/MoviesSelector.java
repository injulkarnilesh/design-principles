package INVERSION_OF_CONTROL.example.violation;

import java.util.List;
import java.util.stream.Collectors;

public class MoviesSelector {

    private DatabaseMoviesProvider moviesProvider;

    /*
    What MoviesProvider to use is controlled from inside of this class.
    Control lies here.
     */
    public MoviesSelector() {
        this.moviesProvider = new DatabaseMoviesProvider();
    }

    private List<Movie> directedBy(String directionName) {
        return moviesProvider.getAll()
                .stream()
                .filter(m -> m.getDirector().equals(directionName))
                .collect(Collectors.toList());
    }

}
