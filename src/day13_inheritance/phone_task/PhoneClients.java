package day13_inheritance.phone_task;

public class PhoneClients {
    public static void main(String[] args) {

        IPhone iPhone = new IPhone("iPhone 12", "6.1 inches", "999.99", "Blue", 400);
        Samsung samsung = new Samsung("Galaxy S21", "6.2 inches", "899.99", "Black", 300);
        Nokia nokia = new Nokia("Brick", "2.4 inches", "49.99", "Gray", 800);

        System.out.println("IPhone:-------------");
        System.out.println(iPhone);
        iPhone.call("1234567890");
        iPhone.text("1234567890");
        iPhone.faceTime("1234567890");

        System.out.println("Samsung:------------");
        System.out.println(samsung);
        samsung.call("9876543210");

        System.out.println("Nokia:-------------");
        System.out.println(nokia);
        nokia.text("987654321");


    }
}
