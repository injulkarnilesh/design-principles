package SOLID.INTERFACE_SEGREGATION.example.violation;

public class Penguin implements Bird {
    public void talk() {
        System.out.println("Penguin Talking");
    }

    public void walk() {
        System.out.println("Penguin Walking");
    }
    /*
    Not cool. Bird interface is forcing Penguin to implement fly that it does not support.
    */
    public void fly() {
        throw new UnsupportedOperationException("Penguins can not fly");
    }
}