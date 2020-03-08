package PREMATURE_ABSTRACTION.example.fix;

public class Rating {
  private final float value;

  public Rating(float value) {
    //validate value
    this.value = value;
  }

  public float getValue() {
    return value;
  }
}
