package DRY.example.fix;

import java.util.List;
import java.util.stream.Collectors;

public class OffersPage {

  private List<Offer> offers;
  /*
    Depends only upon details required.
    Still not repeated at places.
   */
  public String offerMessage() {
    return offers.stream().map(offer -> offer.description())
        .collect(Collectors.joining("\n"));
  }

}
