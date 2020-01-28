package COHESION_AND_COUPLING.example.coupling.fix;

public interface CalculatorUI {
    /*
    Not directly coupled with mathematical logic
     */
    void showResult(double result);
    double takeInput(String variable);
}
