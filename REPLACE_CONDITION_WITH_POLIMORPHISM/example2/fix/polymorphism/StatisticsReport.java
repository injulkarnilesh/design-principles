package REPLACE_CONDITION_WITH_POLIMORPHISM.example2.fix.polymorphism;

import java.util.List;

public class StatisticsReport {

    protected List<Data> data;

    /*
    Abstraction can act as default implementation.
    But we need a conditional to choose appropriate type of Statistics Report somewhere.
    Can use factory pattern to decide which instance to use.
     */
    public String report() {
        return data.toString();
    }

    public static class Data {

    }

}
