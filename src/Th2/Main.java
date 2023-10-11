package Th2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Hãy tạo một lớp cha "Vehicle" (Xe cộ) với các thuộc tính như "brand" (thương hiệu)
        // và "color" (màu sắc). Tạo các lớp con là "Car" (Ô tô) và "Motorcycle" (Xe máy)
        // kế thừa từ lớp "Vehicle". Trong các lớp con, triển khai các phương thức để hiển thị thông tin về xe cộ.

        // khoi tao doi tuong tu cac lop con
        // Vehicle vehicle = new Vehicle();
        Motorcycle motorcycle1 = new Motorcycle("honda", "mau trang");
        Motorcycle motorcycle2 = new Motorcycle("yamaha", "mau hong");
        Car car1 = new Car("toyota", "mau den");
        Car car2 = new Car("honda", "mau vang");

        // set get
        System.out.println("thương hiệu trước khi thay đổi: " + car1.getBrand());
        car1.setColor("mau xanh");
        System.out.println("màu sắc sau khi thay đổi: " + car1.getColor());

        // hiển thị thông tin của xe oto
        System.out.println(car1.toString());
        System.out.println(car2.toString());

        // hiển thị thông tin xe máy
        System.out.println(motorcycle1.toString());
        System.out.println(motorcycle2.toString());
    }
}
