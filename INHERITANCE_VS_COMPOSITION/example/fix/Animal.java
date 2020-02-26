package INHERITANCE_VS_COMPOSITION.example.fix;

/*
Common code lies in Helper classes, could have done better than *Helper names, but you get the idea.
Does not impose anything on other unrelated classes.
 */
public class Animal {

  private EaterHelper eaterHelper;
  private TalkHelper talkHelper;
  private WalkHelper walkHelper;

  public void eat() {
    eaterHelper.eat();
  }

  public void talk() {
    talkHelper.talk();
  }

  public void walk() {
    walkHelper.walk();
  }

}
