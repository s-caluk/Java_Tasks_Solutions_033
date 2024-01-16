package day05_loops;

public class Rectangle {
    public static void main(String[] args) {

        for (int i = 0; i <9 ; i++) {
            System.out.print("\t\t");
            for (int j = 0; j <8 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("---------------");

        for (int x = 0; x < 9; x++) {
            System.out.println("\t\t* * * * * * * *");

        }
    }
}
/*
1. Create a class named Rectangle. Use a loop to print the following shape on the console:

			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
 */
