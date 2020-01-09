package SOLID.INTERFACE_SEGREGATION.example.violation;

public class Sparrow implements Bird {
    public void talk() {
        System.out.println("Sparrow Talking");
    }

    public void walk() {
        System.out.println("Sparrow Walking");
    }

    /* All Good */
    public void fly() {
        System.out.println("Sparrow Flying");
    }
}