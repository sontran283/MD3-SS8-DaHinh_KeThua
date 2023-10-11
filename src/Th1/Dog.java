package Th1;

public class Dog extends Animal {
    // Lớp Dog kế thừa lớp Animal : Ngoài ra có thêm thuộc tính color(màu sắc lông)
    // và triển khai phương thức makeSound() được kế thừa từ lớp Animal.
    private String color;

    public Dog(String color) {
        this.color = color;
    }

    public Dog(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String makeSound() {
        return "gâu gâu";
    }
}
