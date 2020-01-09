package SOLID.INTERFACE_SEGREGATION.example.violation;

public interface Bird {
    void talk();
    void walk();
    /*
    Can every bird fly?
    */ 
    void fly();
}