package CODE_SMELLS.PRIMITIVE_OBSESSION.example1.violation;

public class Address {
    private String houseNumber;
    private String street;
    private String area;
    /*
    ZipCode has different representations at different places.
    String can hold them all but can all strings be ZipCode?
    If we were to validate ZipCode or have some more behaviour
    wouldn't that better be inside ZipCode than other classes like Address
     */
    private String zipCode;
    private String city;
}
