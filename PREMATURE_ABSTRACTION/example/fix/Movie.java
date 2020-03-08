package PREMATURE_ABSTRACTION.example.fix;

import PREMATURE_ABSTRACTION.example.violation.Rating;
import java.time.Duration;
import java.util.Date;
import java.util.List;

public class Movie {

  private String title;
  private Duration runTime;
  private Date releaseDate;
  private Rating rating;
  private List<String> genres;
  private Date premierDate;

  public String getTitle() {
    return title;
  }

  public Duration getRunTime() {
    return runTime;
  }

  public Date getReleaseDate() {
    return releaseDate;
  }

  public Rating getRating() {
    return rating;
  }

  public List<String> getGenres() {
    return genres;
  }

  public Date getPremierDate() {
    return premierDate;
  }
}
