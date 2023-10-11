package Th1;

public class Animal {
    // Lớp Animal : Có  thuộc tính là name(tên gọi) và phương thức là makeSound (tiếng kêu của nó)
    private String name;

    public String makeSound() {
        return "kêu";
    }

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
