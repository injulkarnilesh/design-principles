package CODE_SMELLS.GOD_OBJECT.example.fix;

public abstract class UnSupportedOpsATMState implements ATMState {

    @Override
    public void insertCard(final ATMMachine machine) {
        throw new UnsupportedOperationException("Can't take card in state " + this);
    }

    @Override
    public void removeCard(final ATMMachine machine) {
        throw new UnsupportedOperationException("Can't remove card in state " + this);
    }

    @Override
    public void enterPin(final ATMMachine machine, final String pin) {
        throw new UnsupportedOperationException("Can't read pin in state " + this);
    }

    @Override
    public void withdrawMoney(final ATMMachine machine, final int amount) {
        throw new UnsupportedOperationException("Can't withdraw money in state " + this);
    }
}
