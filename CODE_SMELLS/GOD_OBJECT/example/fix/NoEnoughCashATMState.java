package CODE_SMELLS.GOD_OBJECT.example.fix;

public class NoEnoughCashATMState extends UnSupportedOpsATMState {

    public static final NoEnoughCashATMState INSTANCE = new NoEnoughCashATMState();

    private NoEnoughCashATMState() {
    }

    @Override
    public void removeCard(final ATMMachine machine) {
        machine.setState(NoCardATMState.INSTANCE);
    }

    @Override
    public void withdrawMoney(final ATMMachine machine, final int amount) {
        //No, Can't do
        machine.setState(ValidPinATMState.INSTANCE);
    }
}
