package ENCAPSULATION.example1.fix;

import java.util.List;
import java.util.UUID;

public interface PersistenceService {
  <T> UUID save(T entity);
  <T> List<T> all();
}
