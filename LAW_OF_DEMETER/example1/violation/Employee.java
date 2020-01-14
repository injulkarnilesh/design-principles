package LAW_OF_DEMETER.example1.violation;

public class Employee {
    private Address currentAddress;
    private Address permanentAddress;

    public Address getCurrentAddress() {
        return currentAddress;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }
}
