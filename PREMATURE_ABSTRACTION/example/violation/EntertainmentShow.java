package PREMATURE_ABSTRACTION.example.violation;

import java.time.Duration;
import java.util.Date;
import java.util.List;

/*
This was extracted after initially seeing a log of common things in
Movies and TV Series, Seasons and Episodes.
We regret doing that.
 */
public abstract class EntertainmentShow {

  protected String title;
  protected int number; //For seasons and episodes
  protected Duration runTime;
  protected Date releaseDate;
  protected Rating rating;
  protected List<String> genres;

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

  public int getNumber() {
    return number;
  }
}
