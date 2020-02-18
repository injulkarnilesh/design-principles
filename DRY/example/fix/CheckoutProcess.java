package DRY.example.fix;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class CheckoutProcess {

  private List<Offer> offers;

  /*
  What offers are there is a business knowledge.
  That stays in implementations of offer.
  Not repeated at places.
   */
  public BigDecimal checkout(Cart cart) {
    BigDecimal totalDiscount = offers.stream()
        .filter(offer -> offer.isApplicable(cart))
        .map(offer -> offer.calculateDiscount(cart))
        .collect(Collectors.reducing(BigDecimal.ZERO, (d1, d2) -> d1.add(d2)));
    return cart.total().subtract(totalDiscount);
  }

  public static class Cart {
    BigDecimal total() {
      return BigDecimal.ZERO;
    }
  }

}
