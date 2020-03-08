package PREMATURE_ABSTRACTION.example.fix;

import PREMATURE_ABSTRACTION.example.violation.Rating;
import java.time.Duration;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


/*
Only has what it should.
 */
public class Episode {
  /*
  Duplication is ok.
  As they represent different things.
   */
  private String title;
  private int number;
  private Duration runTime;
  private Date releaseDate;
  private Rating rating;
  private List<String> specialGuests;

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

  public List<String> getSpecialGuests() {
    return specialGuests;
  }

  public int getNumber() {
    return number;
  }
}
