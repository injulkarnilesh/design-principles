package REPLACE_CONDITION_WITH_POLIMORPHISM.example.violation;

import java.util.List;

public class StatisticsReport {

    private List<Data> data;

    /*
    Adding new format would require changes in this class.
     */
    public String report(ReportType type) {
        switch (type) {
            case HTML_TABLE:
                return "HTML Report";
            case JSON:
                return "JSON Report";
            case XML:
                return "XML Report";
        }
        return data.toString();
    }

    static class Data {

    }

    enum ReportType {
        HTML_TABLE,
        JSON,
        XML
    }
}
