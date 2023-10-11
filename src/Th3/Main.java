package Th3;

public class Main {
    public static void main(String[] args) {
        // kiem thu class shape
        System.out.println("______shape______");
        Shape shape = new Shape();
        System.out.println("shape1: " + shape);

        shape = new Shape("yellow", true);
        System.out.println("shape2: " + shape);

        // kiem thu class circle
        System.out.println("______circle______");
        Circle circle = new Circle();
        System.out.println("circle1 " + circle);

        circle = new Circle(3.8);
        System.out.println("circle2: " + circle);

        circle = new Circle("red", true, 3.8);
        System.out.println("circle3: " + circle);

        // kiem thu class Rectangle
        System.out.println("______Rectangle______");
        Rectangle rectangle = new Rectangle(2, 3, "yellow", true);
        System.out.println("rectangle1 " + rectangle);

        rectangle = new Rectangle(3.4, 1.2);
        System.out.println("rectangle2 " + rectangle);

        rectangle = new Rectangle("blue", true, 3.4, 1.2);
        System.out.println("rectangle3 " + rectangle);

        // kiem tra class Square
        System.out.println("______Square______");
        Square square = new Square(2, "blue", true);
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);
    }
}
