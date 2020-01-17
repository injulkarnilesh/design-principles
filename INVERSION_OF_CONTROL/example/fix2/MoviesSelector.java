package INVERSION_OF_CONTROL.example.fix2;

import java.util.List;
import java.util.stream.Collectors;

public abstract class MoviesSelector {

    public MoviesSelector() {

    }
    /*
    This class does not control which MoviesProvider to use
    Outside world decides.
    In this case, its subclass.
    But which subclass to use, could be decided by IoC container.
     */
    private List<Movie> directedBy(String directionName) {
        return getMoviesProvider().getAll()
                .stream()
                .filter(m -> m.getDirector().equals(directionName))
                .collect(Collectors.toList());
    }

    protected abstract MoviesProvider getMoviesProvider();

}
