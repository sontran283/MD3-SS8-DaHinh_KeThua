package Bt1;

public class Student extends User {
    private String subject;
    public static int diem;
    public Student() {
    }

    public Student(String name, String id, String password, String subject) {
        super(name, id, password);
        this.subject = subject;
    }

    @Override
    public void displayData() {
        super.displayData();
        System.out.println("subject: " + subject);
    }
}
