package SOLID.LISKOV_SUBSTITUTION.example.viaolation;

public class Client {

    /*
    Area for rectangle is expected to be 50 with 5 width and 10 height
    */
    public void rectangleArea() {
        testArea(new Rectangle());
    }

    /*
    If we replace rectangle with square ares is not 50 but is 100
    */
    public void squareArea() {
        testArea(new Square());
    }

    private void testArea(Rectangle rectangle) {
        rectangle.setWidth(5);
        rectangle.setHeight(10);
        assert rectangle.area() == 50;
    }
}