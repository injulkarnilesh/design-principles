package SOLID.OPEN_CLOSED.example1.fix;

public interface Payment {
    /*
    New payment method is added as a new implementation.
    */
    void pay(Double amount);
}