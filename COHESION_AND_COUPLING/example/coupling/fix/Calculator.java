package COHESION_AND_COUPLING.example.coupling.fix;

public interface Calculator {
    /*
    Not coupled with UI related code
     */
    double add(double x, double y);
    double substract(double x, double y);
}
