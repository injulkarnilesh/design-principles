package TELL_DONT_ASK.example.fix;

public class Animal {
    private boolean isHungry;

    public void feed(Food food) {
        if (isHungry) {
            System.out.println("Thanks for the food");
        }
    }
}
