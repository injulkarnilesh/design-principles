package DRY.example.violation;

public class OffersPage {

  /*
  Business logic of discount is repeated here.
   */
  public String offerMessage() {
    return "Flat 10% discount on Bill Amount if Amount is more than 500";
  }

}
