package INHERITANCE_VS_COMPOSITION.example.fix;

/*
Does not get unnecessary methods due to wrong inheritance.
Only has desired behaviours
 */
public class Robot {
  private ChargerHelper chargerHelper;
  private TalkHelper talkHelper;
  private WalkHelper walkHelper;
  private WorkHelper workHelper;

  public void charge() {
    chargerHelper.charge();
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
