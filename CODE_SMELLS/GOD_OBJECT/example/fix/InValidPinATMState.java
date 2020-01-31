package CODE_SMELLS.GOD_OBJECT.example.fix;

public class InValidPinATMState extends UnSupportedOpsATMState {

    public static final InValidPinATMState INSTANCE = new InValidPinATMState();

    private InValidPinATMState() {
    }

    @Override
    public void removeCard(final ATMMachine machine) {
        machine.setState(NoCardATMState.INSTANCE);
    }

    @Override
    public void enterPin(final ATMMachine machine, final String pin) {
        machine.setState(HasCardATMState.INSTANCE);
    }
}
