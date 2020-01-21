package REPLACE_CONDITION_WITH_POLIMORPHISM.example2.fix.composition;

import java.util.List;

public class StatisticsReport {

    private List<Data> data;
    private ReportStrategyFactory reportStrategyFactory;


    public String report(ReportType reportType) {
        return reportStrategyFactory.get(reportType)
                .report(data);
    }

    static class Data {

    }

    enum ReportType {
        HTML_TABLE,
        JSON,
        XML,
        DEFAULT
    }
}
