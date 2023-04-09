/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, T. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
import java.util.Scanner;

public class TestBowlingShopApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice;
        System.out.println("  Welcome to the Bowling Shop\n");
        do {
// 1. A public static method named displayMenu that displays the menu
            displayMenu();
            choice = input.nextLine().toLowerCase().charAt(0);
// 2. Display the menu to the user and invoke the getProducts method from the ProductDB
// class with the user’s entry as the argument. Assign the results to a product generic queue
// named products. Using a while loop iterate over the queue and invoke the dequeue
// method to display the contents.
            switch (choice) {
                case 'b':
                    System.out.println("\n  --Product Listing--");
                    GenericQueue<Product> ballQueue = ProductDB.getProducts("b");
                    displayProducts(ballQueue);
                    break;
                case 'a':
                    System.out.println("\n  --Product Listing--");
                    GenericQueue<Product> bagQueue = ProductDB.getProducts("a");
                    displayProducts(bagQueue);
                    break;
                case 's':
                    System.out.println("\n  --Product Listing--");
                    GenericQueue<Product> shoeQueue = ProductDB.getProducts("s");
                    displayProducts(shoeQueue);
                    break;
                case 'x':
                    System.out.println("\n  End of line...");
                    break;
                default:
                    System.out.println("\n  Invalid option. Please try again.");
                    break;
            }
	//3. Allow the user to keep selecting options until “x” is chosen.
        } while (choice != 'x');
    }

    public static void displayMenu() {
        System.out.print(
        		"\n  MENU OPTIONS\n" +
                "    1. <b> Bowling Balls\n" +
                "    2. <a> Bowling Bags\n" +
                "    3. <s> Bowling Shoes\n" +
                "    4. <x> To exit\n\n" +
                "  Please choose an option: ");
    }

    public static void displayProducts(GenericQueue<Product> queue) {
    	while (queue.size() > 0) {
            Product product = queue.dequeue();
            System.out.println(product.toString());
            System.out.println();

    }

    }
}
