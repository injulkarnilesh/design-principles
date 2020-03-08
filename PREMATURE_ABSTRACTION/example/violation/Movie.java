package PREMATURE_ABSTRACTION.example.violation;

import java.util.Date;

/*
Does not need number
 */
public class Movie extends EntertainmentShow {

  private Date premierDate;

  public Date getPremierDate() {
    return premierDate;
  }
}
