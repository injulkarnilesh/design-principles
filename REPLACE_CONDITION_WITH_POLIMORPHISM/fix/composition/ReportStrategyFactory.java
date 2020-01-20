package REPLACE_CONDITION_WITH_POLIMORPHISM.fix.composition;

import REPLACE_CONDITION_WITH_POLIMORPHISM.fix.composition.StatisticsReport.ReportType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReportStrategyFactory {

    private Map<ReportType, ReportStrategy> strategies = new HashMap<>();

    /*
    Can use Dependency Injection as well to get all implementations.
     */
    public ReportStrategyFactory(List<ReportStrategy> allStrategies) {
        strategies = allStrategies.stream()
                .collect(Collectors.toMap(ReportStrategy::type, Function.identity()));
    }

    /*
    Use some mechanism to register all implementations into factory.
     */
    public void register(ReportType type, ReportStrategy strategy) {
        this.strategies.put(type, strategy);
    }

    public ReportStrategy get(ReportType type) {
        return strategies.get(type);
    }


    /*
    Or use this place as single source of switch.
     */
    public ReportStrategy forType(ReportType type) {
        switch (type) {
            case HTML_TABLE:
                return new HTMLReportStrategy();
            case JSON:
                return new JSONReportStrategy();
            case XML:
                return new XMLReportStrategy();
            default:
                return new DefaultReportStrategy();
        }
    }
}
