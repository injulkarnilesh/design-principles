package SOLID.INTERFACE_SEGREGATION.example.fix;

public class Penguin implements Bird {

    public void talk() {
        System.out.println("Penguin Talking");
    }

    public void walk() {
        System.out.println("Penguin Walking");
    }
    
}