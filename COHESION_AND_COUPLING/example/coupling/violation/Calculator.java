package COHESION_AND_COUPLING.example.coupling.violation;

public interface Calculator {
    /*
    Mathematical calculations and UI related code are
    coupled together where they should not be
     */
    double add(double x, double y);
    double substract(double x, double y);
    void showResultOnUI(double result);
    double takeInput(String variable);
}
