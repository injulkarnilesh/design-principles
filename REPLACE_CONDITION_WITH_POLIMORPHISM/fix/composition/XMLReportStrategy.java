package REPLACE_CONDITION_WITH_POLIMORPHISM.fix.composition;

import java.util.List;

public class XMLReportStrategy implements ReportStrategy {

    @Override
    public String report(final List<StatisticsReport.Data> data) {
        return "XML Report";
    }

    @Override
    public StatisticsReport.ReportType type() {
        return StatisticsReport.ReportType.XML;
    }
}
