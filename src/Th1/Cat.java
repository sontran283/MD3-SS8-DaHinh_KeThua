package Th1;

public class Cat extends Animal {
    // Lớp Cat kế thừa lớp Animal : Triển khai phương thức makeSound() được kế thừa từ lớp Animal.

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        System.out.println("___test___ " + super.makeSound());
        return "meo meo";
    }
}
