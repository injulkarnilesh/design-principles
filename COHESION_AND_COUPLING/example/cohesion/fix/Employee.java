package COHESION_AND_COUPLING.example.cohesion.fix;

import java.math.BigDecimal;

public class Employee {
    /*
    All employee related stuff in single class
     */
    private String id;
    private String name;

    private BigDecimal salary;
    private String designation;

    private Address currentAddress;
    private Address permanentAddress;

}
