package day12_encapsulation;

public class CandyClients {
    public static void main(String[] args) {

        Candy candy1 = new Candy("Mars", 10, 1.5, false);
        Candy candy2 = new Candy("Snickers", 5, 0, true);

        System.out.println(candy1);  //Candy{brand='Mars', quantity=10, price=1.5}
        System.out.println(candy2);

       candy2.setQuantity(0);

    }
}
