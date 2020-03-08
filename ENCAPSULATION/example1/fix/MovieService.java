package ENCAPSULATION.example1.fix;

import java.time.Year;
import java.util.List;
import java.util.Optional;

public class MovieService {

  private final PersistenceService persistenceService;

  public MovieService(PersistenceService persistenceService) {
    this.persistenceService = persistenceService;
  }

  void saveMovie(String name, int year, String director) {
    Movie newMovie = new Movie(name, Year.of(year), director);
    persistenceService.save(newMovie);
  }

  String getLastNameOfDirectorOfMovie(String movieName) {
    List<Movie> movies = persistenceService.all();
    Optional<Movie> movie = movies.stream().filter(m -> m.getName().equalsIgnoreCase(movieName))
        .findFirst();
    if (movie.isPresent()) {
      return movie.get().getDirectorLastName();
    }
    throw new IllegalArgumentException("Movie not found " + movieName);
  }

}
