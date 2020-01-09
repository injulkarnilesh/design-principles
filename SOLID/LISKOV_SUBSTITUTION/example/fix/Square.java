package SOLID.LISKOV_SUBSTITUTION.example.fix;

/*
Square does not extend rectangle, not at-least with setters for 
width and height
*/
public class Square {
    private int width;

    public void setWidth(int width) {
        this.width = width;
    }
    
    public int area() {
        return width * width;
    }
}