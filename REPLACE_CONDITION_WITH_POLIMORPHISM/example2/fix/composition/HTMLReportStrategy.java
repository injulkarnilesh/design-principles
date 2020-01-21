package REPLACE_CONDITION_WITH_POLIMORPHISM.example2.fix.composition;

import java.util.List;

public class HTMLReportStrategy implements ReportStrategy {

    @Override
    public String report(final List<StatisticsReport.Data> data) {
        return "HTML Report";
    }

    @Override
    public StatisticsReport.ReportType type() {
        return StatisticsReport.ReportType.HTML_TABLE;
    }
}
