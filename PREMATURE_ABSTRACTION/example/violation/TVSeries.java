package PREMATURE_ABSTRACTION.example.violation;

import java.time.Year;
import java.util.Arrays;
import java.util.List;

/*
Needs title, rating and genres from Parent.
Needs release time range not date.
Does not need a number.
 */
public class TVSeries extends EntertainmentShow {

  private List<Year> airYears;
  private List<Season> seasons;

  public List<Year> getAirYears() {
    return airYears;
  }
}
