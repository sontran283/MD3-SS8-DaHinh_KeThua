package Bt1;

import java.util.Scanner;

public class User {
    private String name;
    private String id;
    private String password;

    public User() {
    }

    public User(String name, String id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Login");
        System.out.println("nhap ten dang nhap: ");
        String loginName = scanner.nextLine();
        System.out.println("nhap mat khau: ");
        String loginPassword = scanner.nextLine();
        if (loginName.equals(getName()) && loginPassword.equals(getPassword())) {
            System.out.println("dang nhap thanh cong");
            displayData();
        } else {
            System.out.println("ko thanh cong");
        }
    }

    public void displayData() {
        System.out.println(
                "User{" +
                        "name='" + name + '\'' +
                        ", id='" + id + '\'' +
                        ", password='" + password + '\'' +
                        '}'
        );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
