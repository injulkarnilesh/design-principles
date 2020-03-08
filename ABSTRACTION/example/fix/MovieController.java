package ABSTRACTION.example.fix;

import java.time.Year;
import java.util.List;
import java.util.stream.Collectors;

public class MovieController {

  private final MoviesService moviesService;

  public MovieController(MoviesService moviesService) {
    this.moviesService = moviesService;
  }

  /*
  How movies are loaded from whichever source
  is abstracted out using Abstraction and DI.
   */
  public List<Movie> findMoviesOfYear(Year year) {
    return moviesService.movies()
        .stream()
        .filter(m -> year.equals(m.getYearOfRelease()))
        .collect(Collectors.toList());
  }

}
