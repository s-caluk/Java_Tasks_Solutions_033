package day12_encapsulation;

public class ItemClients {
    public static void main(String[] args) {
        Item item1 = new Item("Pen", 1.5, 10);
        Item item2 = new Item("Notebook", 3.0 , 8);

        System.out.println(item1);  //item{name='Pen', unitPrice=1.5, quantity=10, totalCost=15.0}
    }
}
