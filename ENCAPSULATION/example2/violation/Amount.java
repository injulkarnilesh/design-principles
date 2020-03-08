package ENCAPSULATION.example2.violation;

import java.math.BigDecimal;
import java.util.Currency;

public class Amount {

  /*
  Good that state is private
   */
  private BigDecimal value;
  private Currency currency;

  public BigDecimal getValue() {
    return value;
  }

  /*
  Is this really required or a good idea?
   */
  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }
}
