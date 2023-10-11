package Bt4;

import Bt3.Point3D;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        MoveablePoint moveablePoint = new MoveablePoint(1, 3);
        System.out.println(Arrays.toString(moveablePoint.getXY()));
    }
}
