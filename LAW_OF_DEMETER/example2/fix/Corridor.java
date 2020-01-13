package LAW_OF_DEMETER.example2.fix;

public class Corridor {

    private ElectricDevice light;

    public ElectricDevice getLight() {
        return light;
    }

    /*
    Calling method of Light Ok.
     */
    public void turnOnLight() {
        this.light.on();
    }

    enum Type {
        MAIN,
        SUB
    }
}
