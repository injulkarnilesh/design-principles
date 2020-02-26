package INHERITANCE_VS_COMPOSITION.example.violation;

/*
Changes in Animal can cause changes in Person
 */
public class Person extends Animal {

  public void work() {
    System.out.println("Person Eating");
  }
}
