package CODE_SMELLS.GOD_OBJECT.example.fix;

public interface ATMState {
    void insertCard(ATMMachine machine);
    void removeCard(ATMMachine machine);
    void enterPin(ATMMachine machine, String  pin);
    void withdrawMoney(ATMMachine machine, int amount);
}
