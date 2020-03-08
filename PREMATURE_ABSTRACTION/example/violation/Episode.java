package PREMATURE_ABSTRACTION.example.violation;

import java.util.List;

/*
Genre is duplicate across all episode of same Series.
 */
public class Episode extends EntertainmentShow {
  private List<String> specialGuests;

  public List<String> getSpecialGuests() {
    return specialGuests;
  }
}
