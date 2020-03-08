package PREMATURE_ABSTRACTION.example.fix;

import PREMATURE_ABSTRACTION.example.violation.Rating;
import java.time.Duration;
import java.time.Year;
import java.util.List;

/*
Only has what it should.
 */
public class TVSeries {

  private String title;
  private Rating rating;
  private List<String> genres;
  private List<Year> airYears;
  private List<Season> seasons;

  public String getTitle() {
    return title;
  }

  public Rating getRating() {
    return rating;
  }

  public List<String> getGenres() {
    return genres;
  }

  public List<Season> getSeasons() {
    return seasons;
  }

  public List<Year> getAirYears() {
    return airYears;
  }
}
