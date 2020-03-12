package SOLID.SINGLE_RESPONSIBILITY.example.violation;

import java.util.HashMap;
import java.util.Map;

public class Employee {

    /* 
    If structure of employee changes, Employee class Changes. Ok
    */
    private String employeeId;
    private String name;
    private Double baseSalary;
    
    /*
    If the way pay is calculate changes, Employee class Changes. Not Ok.
    */
    public Double calculatePay() {
        return Double.MIN_NORMAL;
    }
    
    /*
    If the way reporting is done, Employee class Changes. Not Ok.
    */
    public Map<String, Integer> weeklyReport() {
        return new HashMap<>();
    }

    /*
    If the way persistence happens, Employee class Changes. Not Ok.
    */
    public void persist() {

    }

}