package KISS.example.fix;

import java.math.BigDecimal;

public class TaxSlab {
  private final BigDecimal from;
  private final BigDecimal to;
  private final BigDecimal percentage;

  public TaxSlab(BigDecimal from, BigDecimal to, BigDecimal percentage) {
    this.from = from;
    this.to = to;
    this.percentage = percentage;
  }

  public BigDecimal getFrom() {
    return from;
  }

  public BigDecimal getTo() {
    return to;
  }

  public BigDecimal getPercentage() {
    return percentage;
  }

  public BigDecimal apply(BigDecimal income) {
    if (income.compareTo(from) > 0) {
      return income.min(to)
              .subtract(from)
              .multiply(percentage)
              .divide(BigDecimal.valueOf(100));
    }
    return BigDecimal.ZERO;
  }

}
