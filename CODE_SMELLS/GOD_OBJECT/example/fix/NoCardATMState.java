package CODE_SMELLS.GOD_OBJECT.example.fix;


public class NoCardATMState extends UnSupportedOpsATMState {

    public static final NoCardATMState INSTANCE = new NoCardATMState();

    private NoCardATMState() {
    }

    @Override
    public void insertCard(final ATMMachine machine) {
        machine.setState(HasCardATMState.INSTANCE);
    }
}
