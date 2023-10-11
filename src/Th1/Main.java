package Th1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("con lợn");
        Dog dog1 = new Dog("tuan anh", "mau vang");
        Dog dog2 = new Dog("bang nguyen", "mau do");
        Cat cat = new Cat("anh duc");

        // dung phuong thuc set/get de thay doi thuoc tinh
        System.out.println("_____________________________");
        System.out.println("tên trước khi thay đổi: " + animal1.getName());
        animal1.setName("con gà");
        System.out.println("tên sau khi thay đổi: " + animal1.getName());

        // truy cập phương thức được kế thừa từ lớp cha
        System.out.println("_____________________________");
        dog1.setName("becJe");
        System.out.println("tên: " + dog1.getName());
        System.out.println("tiếng kêu: " + dog1.makeSound());
        System.out.println("màu sắc: " + dog2.getColor());
        System.out.println("tiếng kêu: " + dog2.makeSound());
        System.out.println("tên: " + cat.getName());
        System.out.println("tiếng kêu:  " + cat.makeSound());
    }
}
