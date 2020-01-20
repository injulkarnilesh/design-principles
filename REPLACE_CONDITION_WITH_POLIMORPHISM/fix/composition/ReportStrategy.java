package REPLACE_CONDITION_WITH_POLIMORPHISM.fix.composition;

import REPLACE_CONDITION_WITH_POLIMORPHISM.fix.composition.StatisticsReport.Data;
import REPLACE_CONDITION_WITH_POLIMORPHISM.fix.composition.StatisticsReport.ReportType;

import java.util.List;

public interface ReportStrategy {
    String report(List<Data> data);
    ReportType type();
}
