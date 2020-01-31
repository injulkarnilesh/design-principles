package CODE_SMELLS.GOD_OBJECT.example.fix;


import java.math.BigDecimal;

public class ValidPinATMState extends UnSupportedOpsATMState {

    public static final ValidPinATMState INSTANCE = new ValidPinATMState();

    private ValidPinATMState() {
    }

    @Override
    public void removeCard(final ATMMachine machine) {
        machine.setState(NoCardATMState.INSTANCE);
    }

    @Override
    public void withdrawMoney(final ATMMachine machine, final int amount) {
        if (machine.getAmount().compareTo(BigDecimal.valueOf(amount)) > 0) {
            machine.setState(WithdrawMoneyATMState.INSTANCE);
            machine.withdrawMoney(amount);
        } else {
            machine.setState(NoEnoughCashATMState.INSTANCE);
        }
    }
}
