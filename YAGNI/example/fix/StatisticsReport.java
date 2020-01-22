package YAGNI.example.fix;

public interface StatisticsReport {

    /*
    Required for now; implement them only.
     */
    Stats byCustomer(String customerId);
    Stats byCountry(String country);
    Stats byState(String state);

    class Stats {

    }
}
