package day11_custom_class_part2;

public class CarpetClients {
    public static void main(String[] args) {

        Carpet obj1 = new Carpet(3,5,8,true);
        Carpet obj2 = new Carpet(5,5,5,false);

        System.out.println(obj1); //Carpet{width=3.0, length=5.0, unitPrice=8.0, isPersian=true}
        System.out.println(obj2);

        System.out.println(obj1.calcCost()); //320.0 (120+200)
        System.out.println(obj2.calcCost()); //125.0

    }
}
