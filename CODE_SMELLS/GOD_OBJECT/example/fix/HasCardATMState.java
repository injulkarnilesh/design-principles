package CODE_SMELLS.GOD_OBJECT.example.fix;


public class HasCardATMState extends UnSupportedOpsATMState {

    public static final HasCardATMState INSTANCE = new HasCardATMState();

    private HasCardATMState() {
    }

    @Override
    public void removeCard(final ATMMachine machine) {
        machine.setState(NoCardATMState.INSTANCE);
    }

    @Override
    public void enterPin(final ATMMachine machine, final String pin) {
        if (isPinValid(pin)) {
            machine.setState(ValidPinATMState.INSTANCE);
        } else {
            machine.setState(InValidPinATMState.INSTANCE);
        }
    }

    private boolean isPinValid(final String pin) {
        return false;
    }
}
