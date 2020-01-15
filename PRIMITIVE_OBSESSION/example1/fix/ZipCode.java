package PRIMITIVE_OBSESSION.example1.fix;

public class ZipCode {
    final String value;

    private ZipCode(final String value) {
        //Validation.
        this.value = value;
    }

    public static ZipCode of(final String value) {
        return new ZipCode(value);
    }

    @Override
    public String toString() {
        return value;
    }
}
