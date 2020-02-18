package DRY.example.fix;

import DRY.example.fix.CheckoutProcess.Cart;
import java.math.BigDecimal;

public interface Offer {
  boolean isApplicable(Cart cart);
  BigDecimal calculateDiscount(Cart cart);
  String description();

}
