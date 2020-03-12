package SOLID.SINGLE_RESPONSIBILITY.example.fix;

import java.util.List;

public interface SalaryCalculator {
    Double calculate(Employee employee, List<TaxRule> taxRules);

    class TaxRule {
        
    }
}