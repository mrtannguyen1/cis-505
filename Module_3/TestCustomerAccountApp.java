/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, T. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
import java.util.Scanner;
//Create TestCustomerAccountApp
public class TestCustomerAccountApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Account account = new Account(); // create an Account object
        Customer customer; // declare a Customer variable
        System.out.println("  Welcome to Customer Account App\n");

        // 1. Prompt the user to enter a customer number between 1007 and 1009. Use the inputted
        //    number to invoke the getCustomer static method and assign the returned value to a
        //    variable named customer.
        System.out.print("  Enter a customer ID:\n    ex: 1007, 1008, 1009>: ");
        int customerId = input.nextInt();
        customer = CustomerDB.getCustomer(customerId);

        char choice;
        do {
            // 2. Display the account menu using the account's displayMenu method.
            account.displayMenu();

            // 3. Prompt the user to select an option.
            System.out.print("  Enter an option: ");
            choice = input.next().charAt(0);

            switch (choice) {
                case 'D':
                case 'd':
                    // Deposit money into the account.
                    System.out.print("\n  Enter deposit amount: ");
                    double depositAmt = input.nextDouble();
                    account.deposit(depositAmt);
                    break;
                case 'W':
                case 'w':
                    // Withdraw money from the account.
                    System.out.print("\n  Enter withdraw amount: ");
                    double withdrawAmt = input.nextDouble();
                    account.withdraw(withdrawAmt);
                    break;
                case 'B':
                case 'b':
                    // Display the account balance.
                    System.out.printf("\n  Account balance: $%,6.2f", account.getBalance());
                    break;
                default:
                    // Invalid option.
                    System.out.println("\n  Error: Invalid Option.");
                    break;
            }

            // 4. Allow the user to continue to select as many options as they choose by prompting them to
            //    decide between continuing or exiting the menu. Use a do…while loop in your programming logic.
            do {
            System.out.print("\n  Continue? (y/n): ");
            choice = input.next().charAt(0);
            } while (choice != 'n' &&	 choice != 'y');

        } while (choice != 'n');

        // 5. After exiting the menu, display the customer's details using the customer's toString() method.
        System.out.println("\n  " + customer.toString());
        //    Next, on a separate line, show the customer's account balance.
        System.out.printf("  Balance as of %s is: $%,6.2f\n", account.getTransactionDate(), account.getBalance());
        System.out.println("\n  End of line...");
        input.close(); // close the scanner
    } //End Main
} //End TestCustomerAccountApp Class
