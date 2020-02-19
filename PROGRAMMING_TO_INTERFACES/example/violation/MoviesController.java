package PROGRAMMING_TO_INTERFACES.example.violation;

import java.util.List;
import java.util.stream.Collectors;

public class MoviesController {

  /*
  If we are to change IMDB as source to our own database.
  This class has to be changes unnecessarily.
   */
  private IMDBMoviesService moviesService = new IMDBMoviesService();

  public List<Movie> searchByGenre(String genre) {
      return moviesService.getAll()
          .stream().filter(m -> m.getGenres().contains(genre))
          .collect(Collectors.toList());
  }

}
