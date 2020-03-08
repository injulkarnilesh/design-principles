package PREMATURE_ABSTRACTION.example.fix;

import PREMATURE_ABSTRACTION.example.violation.Rating;
import java.time.Duration;
import java.time.Year;
import java.util.Date;
import java.util.List;


/*
Only has what it should.
 */
public class Season {

  private int number;
  private Year releaseYear;
  private Rating rating;
  private List<Episode> episodes;

  public int getNumber() {
    return number;
  }

  public Year getReleaseYear() {
    return releaseYear;
  }

  public Rating getRating() {
    return rating;
  }

  public List<Episode> getEpisodes() {
    return episodes;
  }
}
