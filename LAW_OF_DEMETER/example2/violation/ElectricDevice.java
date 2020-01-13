package LAW_OF_DEMETER.example2.violation;

public class ElectricDevice {

    private State state;

    public void on() {
        this.state = State.ON;
    }

    public void off() {
        this.state = State.OFF;
    }

    enum State {
        ON, OFF
    }

}
