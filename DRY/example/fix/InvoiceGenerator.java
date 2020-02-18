package DRY.example.fix;

import DRY.example.fix.CheckoutProcess.Cart;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class InvoiceGenerator {

  private List<Offer> appliedOffers;

  /*
  Knowledge of offers not repeated.
  Many places refer to them. But not repeated.
   */
  public Invoice get(Order order) {
    Invoice invoice = new Invoice(order);
    BigDecimal totalDiscount = appliedOffers.stream()
        .map(offer -> offer.calculateDiscount(order.cart))
        .collect(Collectors.reducing(BigDecimal.ZERO, (d1, d2) -> d1.add(d2)));
    invoice.discount = totalDiscount;
    return invoice;
  }


  public static class Invoice {
    private final Order order;
    private BigDecimal discount;

    public Invoice(Order order) {
      this.order = order;
    }
  }

  public static class Order {
    private Cart cart;
    public BigDecimal total() {
      return BigDecimal.ZERO;
    }
  }

}
