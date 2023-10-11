package Bt2;

public class Cylinder {
    private double radius;
    private String color;



    public Cylinder() {
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public void S_HinhTron() {
        System.out.println(
                Math.PI * radius * radius
        );
    }

    public Cylinder(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
