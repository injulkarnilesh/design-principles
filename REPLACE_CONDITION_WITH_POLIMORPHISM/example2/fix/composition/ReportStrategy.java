package REPLACE_CONDITION_WITH_POLIMORPHISM.example2.fix.composition;

import java.util.List;

public interface ReportStrategy {
    String report(List<StatisticsReport.Data> data);
    StatisticsReport.ReportType type();
}
