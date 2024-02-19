package day12_encapsulation;

public class RectangleClients {
    public static void main(String[] args) {
        Rechtangle obj1 = new Rechtangle(3,4);
        Rechtangle obj2 = new Rechtangle(8,10);


        System.out.println(obj1); //Rechtangle{width=3, length=4, area=12.0, perimeter=14.0}
        System.out.println(obj2); //Rechtangle{width=8, length=10, area=80.0, perimeter=36.0}
    }

}
