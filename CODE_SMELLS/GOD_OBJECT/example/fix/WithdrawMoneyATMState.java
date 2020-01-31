package CODE_SMELLS.GOD_OBJECT.example.fix;

public class WithdrawMoneyATMState extends UnSupportedOpsATMState {
    public static final WithdrawMoneyATMState INSTANCE = new WithdrawMoneyATMState();

    private WithdrawMoneyATMState() {
    }

    @Override
    public void removeCard(final ATMMachine machine) {
        machine.setState(NoCardATMState.INSTANCE);
    }

    @Override
    public void withdrawMoney(final ATMMachine machine, final int amount) {
        //Withdraw money
        machine.setState(ValidPinATMState.INSTANCE);
    }
}
