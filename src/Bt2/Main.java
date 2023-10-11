package Bt2;

import Th2.Car;
import Th2.Motorcycle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** Circle ***");
        Circle circle = new Circle(3, "yellow");
        System.out.println(circle.toString());

        System.out.println("*** Cylinder ***");
        Cylinder cylinder = new Cylinder(4, "blue");
        System.out.println(cylinder.toString());
    }
}
