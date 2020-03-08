package PREMATURE_ABSTRACTION.example.violation;

import java.time.Year;
import java.util.List;

/*
Needs rating.
Release year not date.
Title could be hacked to represent the number like S-01
 */
public class Season extends EntertainmentShow {
  private Year releaseYear;
  private List<Episode> episodes;

  public Year getReleaseYear() {
    return releaseYear;
  }
}
