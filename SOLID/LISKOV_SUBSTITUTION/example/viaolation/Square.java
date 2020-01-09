package SOLID.LISKOV_SUBSTITUTION.example.viaolation;

public class Square extends Rectangle {
    
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }
    
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }

}