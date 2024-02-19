package day11_custom_class_part2;

public class PizzaClients {
    public static void main(String[] args) {

        Pizza obj1 = new Pizza("medium", 2, 3);
        Pizza obj2 = new Pizza("large", 4, 2);
        Pizza obj3 = new Pizza("small", 1, 3);

        System.out.println(obj1); //Pizza{size='medium', numberOfCheeseTopping=2, numberOfPepperoniTopping=3}

        System.out.println(obj2.calcCost());  //26.0
        System.out.println(obj3.calcCost());  //18.0


    }
}
