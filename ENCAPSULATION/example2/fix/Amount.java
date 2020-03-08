package ENCAPSULATION.example2.fix;

import java.math.BigDecimal;
import java.util.Currency;

public class Amount {

  private final BigDecimal value;
  private final Currency currency;

  /*
  For the Love of Immutability
   */
  public Amount(BigDecimal value, Currency currency) {
    this.value = value;
    this.currency = currency;
  }

  public BigDecimal getValue() {
    return value;
  }

  public Currency getCurrency() {
    return currency;
  }
}
