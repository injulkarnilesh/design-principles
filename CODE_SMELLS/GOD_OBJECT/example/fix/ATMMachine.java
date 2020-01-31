package CODE_SMELLS.GOD_OBJECT.example.fix;

import java.math.BigDecimal;

public class ATMMachine {
    private BigDecimal amount;
    private ATMState state;

    void insertCard() {
        state.insertCard(this);
    }

    void removeCard() {
        state.removeCard(this);
    }

    void enterPin(String pin) {
        state.enterPin(this, pin);
    }

    void withdrawMoney(int amount) {
        state.withdrawMoney(this, amount);
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(final BigDecimal amount) {
        this.amount = amount;
    }

    public void setState(final ATMState state) {
        this.state = state;
    }

}
