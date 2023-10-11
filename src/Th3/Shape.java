package Th3;

public class Shape {
    // Có hai thuộc tính là color (String) và filled (boolean).
    // Có hai phương thức khởi tạo, một trong số đó không cần đối số đầu vào mà sử dụng giá trị mặc định:
    // "green" cho color và true cho filled. Phương thức khởi tạo còn lại đặt giá trị cho thuộc tính của color
    // và filled theo giá trị của đối số truyền vào.
    // Có các getter và setter cho tất cả các thuộc tính.
    // Được cài đè phương thức toString trả về chuỗi ký tự theo mẫu "A Shape with color of xxx and filled/not filled".
    // Có hai lớp con là Circle và Rectangle
    private String color = "green";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String toString() {
        return " Một hình dạng có màu sắc "
                + getColor()
                + " and "
                + (isFilled() ? " filled " : " not filled ");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
