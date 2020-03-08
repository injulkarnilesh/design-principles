package ENCAPSULATION.example1.violation;

import java.util.List;
import java.util.Optional;

public class MovieService {

  private final PersistenceService persistenceService;

  public MovieService(PersistenceService persistenceService) {
    this.persistenceService = persistenceService;
  }

  void saveMovie(String name, int year, String director) {
    Movie newMovie = new Movie();
    newMovie.name = name;
    newMovie.director = director;
    validateYear(year);
    /*
    If the presentation of Year changes, this code changes.
     */
    newMovie.releaseYear = year;
    persistenceService.save(newMovie);
  }

  String getLastNameOfDirectorOfMovie(String movieName) {
    List<Movie> movies = persistenceService.all();
    Optional<Movie> movie = movies.stream().filter(m -> m.name.equalsIgnoreCase(movieName))
        .findFirst();
    if (movie.isPresent()) {
      /*
      If surname extraction logic changes, this code changes.
      Even though what changes is Movie internals.
       */
      return movie.get().director.split(" ")[1];
    }
    throw new IllegalArgumentException("Movie not found " + movieName);
  }

  /*
  Every place where movie year is concerned, this code can get duplicated
   */
  private void validateYear(int year) {
    //validate if year number is a valid year;
  }

}
