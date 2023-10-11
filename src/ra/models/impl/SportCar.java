package ra.models.impl;

import ra.models.Car;

public class SportCar extends Car {
    public void test() {
        if(super.wheelNumber == 4){
            System.out.println("test so luong banh xe");
        }
        super.movement();
    }
}
