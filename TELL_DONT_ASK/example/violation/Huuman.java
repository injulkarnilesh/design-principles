package TELL_DONT_ASK.example.violation;

public class Huuman {

    /*
    Huuman need not to make decision based on Animal's state and decide to feed it.
    Code is asking if animal if hungry and then it is asking it to feed it.
     */
    public void pet(Animal animal){
        if (animal.isHungry()) {
            animal.feed(food());
        }
    }

    private Food food() {
        return null;
    }

}
