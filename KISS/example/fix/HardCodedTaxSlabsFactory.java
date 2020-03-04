package KISS.example.fix;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HardCodedTaxSlabsFactory implements TaxSlabsFactory {

  private static final Map<String, List<TaxSlab>> slabsByCountry = new HashMap<>();

  static {
    slabsByCountry.put("IND", Arrays.asList(
        new TaxSlab(BigDecimal.valueOf(250000), BigDecimal.valueOf(500000), BigDecimal.valueOf(10)),
        new TaxSlab(BigDecimal.valueOf(500000), BigDecimal.valueOf(1000000), BigDecimal.valueOf(20)),
        new TaxSlab(BigDecimal.valueOf(1000000), BigDecimal.valueOf(Long.MAX_VALUE), BigDecimal.valueOf(30))
    ));

    slabsByCountry.put("USA", Arrays.asList(
        new TaxSlab(BigDecimal.valueOf(5000), BigDecimal.valueOf(10000), BigDecimal.valueOf(10)),
        new TaxSlab(BigDecimal.valueOf(10000), BigDecimal.valueOf(20000), BigDecimal.valueOf(20)),
        new TaxSlab(BigDecimal.valueOf(20000), BigDecimal.valueOf(Long.MAX_VALUE), BigDecimal.valueOf(30))
    ));

  }

  @Override
  public List<TaxSlab> forCountry(String country) {
    return slabsByCountry.getOrDefault(country, new ArrayList<>());
  }
}
