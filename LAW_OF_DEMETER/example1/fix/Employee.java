package LAW_OF_DEMETER.example1.fix;

import java.util.Objects;

public class Employee {
    private Address currentAddress;
    private Address permanentAddress;

    public Address getCurrentAddress() {
        return currentAddress;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public boolean staysInSameCity() {
        final String currentCity = currentAddress.getCity();
        final String permanentCity = permanentAddress.getCity();
        return Objects.equals(currentCity, permanentCity);
    }
}
