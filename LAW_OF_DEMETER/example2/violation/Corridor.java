package LAW_OF_DEMETER.example2.violation;

public class Corridor {

    private ElectricDevice light;

    public ElectricDevice getLight() {
        return light;
    }

    enum Type {
        MAIN,
        SUB
    }
}
