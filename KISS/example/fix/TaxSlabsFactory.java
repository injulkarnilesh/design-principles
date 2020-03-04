package KISS.example.fix;

import java.util.List;

public interface TaxSlabsFactory {
  List<TaxSlab> forCountry(String country);
}
