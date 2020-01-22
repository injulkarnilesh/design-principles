package YAGNI.example.violation;

public interface StatisticsReport {

    /*
    Required for now
     */
    Stats byCustomer(String customerId);
    Stats byCountry(String country);
    Stats byState(String state);

    /*
    But
    Just in case, if we move to different planet or
    continents become new boundaries like countries.
     */
    Stats byContinent(String continent);
    Stats byPlanet(String planet);

    class Stats {

    }
}
