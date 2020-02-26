package INHERITANCE_VS_COMPOSITION.example.fix;

/*
Can change independent of Animal
 */
public class Person {
  private EaterHelper eaterHelper;
  private TalkHelper talkHelper;
  private WalkHelper walkHelper;
  private WorkHelper workHelper;

  public void eat() {
    eaterHelper.eat();
  }

  public void talk() {
    talkHelper.talk();
  }

  public void walk() {
    walkHelper.walk();
  }

  public void work() {
    workHelper.work();
  }
}
