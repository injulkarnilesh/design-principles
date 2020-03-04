package KISS.example.violation;

import java.math.BigDecimal;

public class TaxCalculator {

  /*
  For such a simple calculation we have written here a lot of code.
  A lot of duplication.
  Change in slab requires changes in a lot of places.
  More code, more are the chances of errors.
  Data is not separated from code.
  Hard to read and understand.
   */
  public BigDecimal calculate(String countryCode, BigDecimal income) {
    BigDecimal taxAmount = BigDecimal.ZERO;
    if ("IND".equalsIgnoreCase(countryCode)) {
      if (income.compareTo(BigDecimal.valueOf(250000)) > 0) {
        BigDecimal upperBound = income.min(BigDecimal.valueOf(500000));
        BigDecimal rangeTax = upperBound.subtract(BigDecimal.valueOf(250000))
            .multiply(BigDecimal.valueOf(10))
            .divide(BigDecimal.valueOf(100));
        taxAmount = taxAmount.add(rangeTax);
      }
      if (income.compareTo(BigDecimal.valueOf(500000)) > 0) {
        BigDecimal upperBound = income.min(BigDecimal.valueOf(1000000));
        BigDecimal rangeTax = upperBound.subtract(BigDecimal.valueOf(500000))
            .multiply(BigDecimal.valueOf(20))
            .divide(BigDecimal.valueOf(100));
        taxAmount = taxAmount.add(rangeTax);
      }
      if (income.compareTo(BigDecimal.valueOf(1000000)) > 0) {
        BigDecimal rangeTax = income.subtract(BigDecimal.valueOf(1000000))
            .multiply(BigDecimal.valueOf(30))
            .divide(BigDecimal.valueOf(100));
        taxAmount = taxAmount.add(rangeTax);
      }
    } else if ("USA".equalsIgnoreCase(countryCode)) {
      if (income.compareTo(BigDecimal.valueOf(5000)) > 0) {
        BigDecimal upperBound = income.min(BigDecimal.valueOf(10000));
        BigDecimal rangeTax = upperBound.subtract(BigDecimal.valueOf(5000))
            .multiply(BigDecimal.valueOf(10))
            .divide(BigDecimal.valueOf(100));
        taxAmount = taxAmount.add(rangeTax);
      }
      if (income.compareTo(BigDecimal.valueOf(10000)) > 0) {
        BigDecimal upperBound = income.min(BigDecimal.valueOf(20000));
        BigDecimal rangeTax = upperBound.subtract(BigDecimal.valueOf(10000))
            .multiply(BigDecimal.valueOf(20))
            .divide(BigDecimal.valueOf(100));
        taxAmount = taxAmount.add(rangeTax);
      }
      if (income.compareTo(BigDecimal.valueOf(20000)) > 0) {
        BigDecimal rangeTax = income.subtract(BigDecimal.valueOf(20000))
            .multiply(BigDecimal.valueOf(30))
            .divide(BigDecimal.valueOf(100));
        taxAmount = taxAmount.add(rangeTax);
      }
    }

    return taxAmount;
  }

}
