package INVERSION_OF_CONTROL.example.fix1;

import java.util.List;
import java.util.stream.Collectors;

public class MoviesSelector {

    private final MoviesProvider moviesProvider;

    /*
    What MoviesProvider to use is not decided from here.
    That control lies outside may be some IoC container.
    This is example of Dependency Injection to invert control of dependencies
    fom inside of this class to somewhere outside of this class
     */
    public MoviesSelector(final MoviesProvider moviesProvider) {
        this.moviesProvider = moviesProvider;
    }

    private List<Movie> directedBy(String directionName) {
        return moviesProvider.getAll()
                .stream()
                .filter(m -> m.getDirector().equals(directionName))
                .collect(Collectors.toList());
    }

}
