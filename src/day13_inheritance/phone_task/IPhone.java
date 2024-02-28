package day13_inheritance.phone_task;

public class IPhone extends Phone{

    public IPhone(String brand, String model, String size, String color, double price) {
        super(brand, model, size, color, price);
    }

    public void faceTime(String phoneNumber){
        System.out.println("facetiming with the number" + phoneNumber);
    }
}
