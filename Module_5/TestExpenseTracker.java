import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//define the TestExpenseTracker class
public class TestExpenseTracker {
    
	// define the main method
	public static void main(String[] args) {
	    // create a scanner object to receive user input
	    Scanner input = new Scanner(System.in);
	    // initialize the continueProgram boolean variable as true
	    boolean continueProgram = true;
	    
	    // #1. Display a menu to the user matching the format in Figure 4.1. 
	    while (continueProgram){
	        // display the welcome message and menu options
	        System.out.println("  Welcome to the Expense Tracker\n");
	        System.out.println("  MENU OPTIONS");
	        System.out.println("    1. View Transactions");
	        System.out.println("    2. Add Transactions");
	        System.out.println("    3. View Expense");
	        System.out.print("\n  Please choose an option: ");
	        // declare the choice variable and initialize it with the input from the user
	        int choice;
	        choice = ValidatorIO.getInt(input, ""); // here ValidatorIO is probably a custom class to validate input
	        
	        // create a switch statement that will perform the desired action based on the user's input
			switch(choice) {
	            case 1:
	            	//#2. If the user selects menu item one, display all the transactions in the expenses.txt file. 
	                viewTransactions(); 
	                break;
	            case 2:
	            	//#3. If the user selects menu item two, allow the user to add a new transaction to the
	            	//expenses.txt file
	            	String c = "y";
	            	while (c.equalsIgnoreCase("y"))
	            	 {		addTransaction();
	            		 c = ValidatorIO.getString(input,"\n  Add another transaction? (y/n): "); // prompt the user to add another transaction
	                 } 
	                break;
	            case 3:
	            	//#4. If the user selects menu item three, display the total expenses of all transactions in the
	            	//expenses.txt file.
	                viewExpense(); 
	                break;
	            default:
	                System.out.println("\n  Invalid choice. Please try again.\n"); // display an error message for invalid input
	                break;
	        }
	        
	        // prompt the user to continue or exit the program
			String continueInput =ValidatorIO.getString(input,"\n  Continues? (y/n): "); // prompt the user to continue or exit the program
	        if (continueInput.equalsIgnoreCase("n")) {
	            continueProgram = false; // set continueProgram to false to exit the while loop
	            System.out.println("\n  Program terminated by the user..."); 
	        }
	        
	    }
	}

	// define the viewTransactions() method to display all the transactions
	public static void viewTransactions() {
	    try {
	        // retrieve all the transactions from the TransactionIO.findAll() method
	        ArrayList<Transaction> transactions = TransactionIO.findAll();
	        if (transactions.size() > 0) {
	            System.out.println("\n  MONTHLY EXPENSE");
	            // display each transaction
	            for (Transaction transaction : transactions) {
	            	 System.out.println(transaction.toString());
	            }
	        } else {
	            System.out.println("\nNo transactions found.\n"); // display an error message when there is no transaction found
	        }
	    } catch (IOException e) {
	        System.out.println("\nError reading transactions file.\n"); // display an error message when an IO exception occurs
	    }
	}

	// define the addTransaction() method to add a new transaction
	public static void addTransaction() {
	    Scanner input = new Scanner(System.in);
	    // prompt the user to enter the transaction description and amount
	    String description = ValidatorIO.getString(input, "\n  Enter the description: ");
	 // This line prompts the user to enter the amount of the transaction using the ValidatorIO class, which ensures that the input is a double value.
	    double amount = ValidatorIO.getDouble(input, "  Enter the amount: ");
	    
	    // This line creates a new Transaction object with the current date, the description entered by the user, and the amount entered by the user.
	    Transaction newTransaction = new Transaction(LocalDate.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy")), description, amount);

	    // This line creates a new ArrayList of Transaction objects, adds the newTransaction to it, and then uses the TransactionIO class to bulk insert the transaction data into the file.
	    ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	    transactions.add(newTransaction);
	    try {
	    	TransactionIO.bulkInsert(transactions);
	    	} catch (IOException e) {
	    System.out.println("\n Exception: "+ e.getMessage());
	    	}
	    }
	    // This method retrieves all transactions using the TransactionIO class, calculates the total expense by adding the amount of each transaction, and displays the total expense in the formatted output.
public static void viewExpense() {
	    try {
	    ArrayList<Transaction> transactions = TransactionIO.findAll();
	    if (transactions.size() > 0) {
	    	double totalExpense = 0;
	    	for (Transaction transaction : transactions) {
	    		totalExpense += transaction.getAmount();
	    	}
	    	System.out.printf("\n Your total monthly expense is $%,6.2f\n", totalExpense);
	    	} else {
	    		System.out.println("\nNo transactions found.\n");
	    	}
	    } catch (IOException e) {
	    	System.out.println("\nError reading transactions file.\n");
	    }
 }
}
