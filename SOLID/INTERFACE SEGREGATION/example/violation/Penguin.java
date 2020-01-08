import javax.naming.OperationNotSupportedException;

public class Penguin implements Bird {
    void talk() {
        System.out.println("Penguin Talking");
    }

    void walk() {
        System.out.println("Penguin Walking");
    }
    /*
    Not cool. Bird interface is forcing Penguin to implement fly that it does not support.
    */
    void fly() {
        throw new OperationNotSupportedException("Penguins can not fly");
    }
}