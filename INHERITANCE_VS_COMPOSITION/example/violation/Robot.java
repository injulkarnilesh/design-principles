package INHERITANCE_VS_COMPOSITION.example.violation;

/*
Direct dependency on Person
 */
public class Robot extends Person {

  /*
  This because Robot is not person
  Neither Animal.
  But it needs to override eat method.
  Or has eat behaviour that it does not support.
   */
  @Override
  public void eat() {
    throw new UnsupportedOperationException();
  }

  public void charge() {
    System.out.println("Charging");
  }

}
