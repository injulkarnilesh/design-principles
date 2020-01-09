package SOLID.INTERFACE_SEGREGATION.example.fix;

public class Sparrow implements FlyingBird {
    public void talk() {
        System.out.println("Sparrow Talking");
    }

    public void walk() {
        System.out.println("Sparrow Walking");
    }
    
    public void fly() {
        System.out.println("Sparrow Flying");
    }
}