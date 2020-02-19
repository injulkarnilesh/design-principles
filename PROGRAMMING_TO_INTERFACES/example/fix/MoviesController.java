package PROGRAMMING_TO_INTERFACES.example.fix;

import java.util.List;
import java.util.stream.Collectors;

public class MoviesController {

  /*
  As now we are programming to interfaces, how movies are read is not the concern of this class.
  It only cares there is some service that will get me all the movies
      The what part.
      Not the how part.
   */
  private final MoviesService moviesService;

  public MoviesController(MoviesService moviesService) {
    this.moviesService = moviesService;
  }

  public List<Movie> searchByGenre(String genre) {
      return moviesService.getAll()
          .stream().filter(m -> m.getGenres().contains(genre))
          .collect(Collectors.toList());
  }

}
