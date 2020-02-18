package DRY.example.violation;

import java.math.BigDecimal;

public class CheckoutProcess {

  public BigDecimal checkout(Cart cart) {
    /*
    10% discount on bill if amount is greater than 500.
    This is a business knowledge, and should not be repeated for DRY reasons.
    It is ok to repeat a code that calculates percentage of amount though.
    DRY does not say much about it.
     */
    if (cart.total().compareTo(BigDecimal.valueOf(500.00)) > 0) {
      return cart.total().multiply(BigDecimal.valueOf(10.00))
          .divide(BigDecimal.valueOf(100.00));
    }
    return cart.total();
  }

  public static class Cart {
    BigDecimal total() {
      return BigDecimal.ZERO;
    }
  }

}
