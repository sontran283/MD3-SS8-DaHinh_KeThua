package ra.models;

public class Car {
    protected int wheelNumber = 4;

    protected void movement() {
        System.out.println("movement; ");
    }

    public Car(String color) {
        System.out.println("xe nay cp mau: " + color);
    }

    public Car() {

    }
}
