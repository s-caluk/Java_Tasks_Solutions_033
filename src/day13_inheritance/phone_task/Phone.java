package day13_inheritance.phone_task;

public class Phone {

    private String brand, model, size, color;
    private double price;

    public Phone(String brand, String model, String size, String color,  double price) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setColor(color);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        if(brand == null || brand.trim().isEmpty()){
            System.err.println("Brand cannot be null, empty, or blank.");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model == null || brand.trim().isEmpty()){
            System.err.println("Model cannot be null, empty, or blank.");
            System.exit(1);
        }
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color == null || color.trim().isEmpty()){
            System.err.println("Color cannot be null, empty, or blank.");
            System.exit(1);
        }
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double priece) {
        if(priece <= 0){
            System.err.println("Price must be greater than zero.");
            System.exit(1);
        }
        this.price = priece;
    }

    public void call(String phoneNumber){
        System.out.println("Calling the number " + phoneNumber);
    }

    public void text(String phoneNumber){
        System.out.println("texting to the number" + phoneNumber);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", priece=" + price +
                '}';
    }
}
