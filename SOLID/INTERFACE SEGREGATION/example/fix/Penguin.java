import javax.naming.OperationNotSupportedException;

public class Penguin implements Bird {
    void talk() {
        System.out.println("Penguin Talking");
    }

    void walk() {
        System.out.println("Penguin Walking");
    }
    
}