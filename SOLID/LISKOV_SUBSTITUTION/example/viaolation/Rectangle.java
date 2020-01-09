package SOLID.LISKOV_SUBSTITUTION.example.viaolation;

public class Rectangle {
    private int width;
    private int height;

    public int area() {
        return width * height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}