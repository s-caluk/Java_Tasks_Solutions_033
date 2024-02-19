package day12_encapsulation;

public class CircleClients {
    public static void main(String[] args) {

        Circle obj1 = new Circle(5);
        Circle obj2 = new Circle(3);

        System.out.println("obj1 :" + obj1); //obj1 :Circle{radius=5.0, area=78.53981633974483, perimeter=31.41592653589793}

        System.out.println("obj2 :" + obj2);

    }
}
