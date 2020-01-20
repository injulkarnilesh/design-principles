package REPLACE_CONDITION_WITH_POLIMORPHISM.fix.composition;

import java.util.List;

public class DefaultReportStrategy implements ReportStrategy {

    @Override
    public String report(final List<StatisticsReport.Data> data) {
        return data.toString();
    }

    @Override
    public StatisticsReport.ReportType type() {
        return StatisticsReport.ReportType.DEFAULT;
    }
}
