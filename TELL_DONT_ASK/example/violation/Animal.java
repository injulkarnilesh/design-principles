package TELL_DONT_ASK.example.violation;

public class Animal {
    private boolean isHungry;

    public boolean isHungry() {
        return isHungry;
    }

    public void feed(Food food) {
        System.out.println("Thanks for the food");
    }
}
