package TELL_DONT_ASK.example.fix;

public class Huuman {

    /*
    Huuman is sending command to Animal to feed.
    Animal is aware of it's state whether it is hungry and can decide for itself.
    Huuman is not coupled with Animal about it's state being hungry.
     */
    public void pet(Animal animal){
        animal.feed(food());
    }

    private Food food() {
        return null;
    }

}
