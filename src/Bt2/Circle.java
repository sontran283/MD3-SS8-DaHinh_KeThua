package Bt2;

public class Circle extends Cylinder {

    private double height;

    public Circle() {
    }

    public Circle(double radius, String color) {
        super(radius, color);
    }

    private void V_HinhTru() {
        System.out.println(
                Math.PI * this.getRadius() * 2 * height
        );
    }

    @Override
    public String toString() {
        return "Circle{" +
                "height=" + height +
                "} " + super.toString();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
