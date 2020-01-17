package INVERSION_OF_CONTROL.example.fix2;

public class DatabaseMoviesSelector extends MoviesSelector {

    /*
    Not good idea.
    But doing this sin just to demonstrate the inversion.
     */
    @Override
    protected MoviesProvider getMoviesProvider() {
        return new DatabaseMoviesProvider();
    }
}
