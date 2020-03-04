package KISS.example.fix;

import java.math.BigDecimal;
import java.util.List;

public class TaxCalculator {

  private final TaxSlabsFactory factory;

  public TaxCalculator(TaxSlabsFactory factory) {
    this.factory = factory;
  }

  /*
  Does one thing and does it well.
  Data and code are different.
  Simple to read and understand.
   */
  public BigDecimal calculate(String country, BigDecimal income) {
    List<TaxSlab> slabs = factory.forCountry(country);
    BigDecimal tax = BigDecimal.ZERO;
    for (TaxSlab slab : slabs) {
      tax.add(slab.apply(income));
    }
    return tax;
  }

}
