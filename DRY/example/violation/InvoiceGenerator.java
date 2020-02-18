package DRY.example.violation;

import DRY.example.violation.CheckoutProcess.Cart;
import java.math.BigDecimal;

public class InvoiceGenerator {

  /*
  Percentage calculation is repeated.
  That could be Ok.
  But repeating the business knowledge of how much offer and on what condition,
  is disastrous.
   */
  public Invoice get(Order order) {
    Invoice invoice = new Invoice(order);
    if (order.total().compareTo(BigDecimal.valueOf(500.00)) > 0) {
      invoice.discount = order.total().multiply(BigDecimal.valueOf(10.00))
          .divide(BigDecimal.valueOf(100.00));
    }
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
