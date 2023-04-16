// Define a class named ValidatorIO
import java.util.Scanner;

public class ValidatorIO {
	// Static method to get an integer input from the user
	public static int getInt(Scanner sc, String prompt) {
	    int input = 0;
	    boolean isValid = false;
	    
	    // Use a while loop to check for valid input
	    while (!isValid) {
	        System.out.print(prompt);
	        
	        // Check if the input is an integer
	        if (sc.hasNextInt()) {
	            input = sc.nextInt();
	            isValid = true;
	        } else {
	            System.out.println("\nError! Invalid integer value.\n");
	        }
	        
	        // Clear the scanner buffer
	        sc.nextLine();
	    }
	    
	    return input;
	}

	// Static method to get a double input from the user
	public static double getDouble(Scanner sc, String prompt) {
	    double input = 0;
	    boolean isValid = false;
	    
	    // Use a while loop to check for valid input
	    while (!isValid) {
	        System.out.print(prompt);
	        
	        // Check if the input is a double
	        if (sc.hasNextDouble()) {
	            input = sc.nextDouble();
	            isValid = true;
	        } else {
	            System.out.println("\nError! Invalid double value.\n");
	        }
	        
	        // Clear the scanner buffer
	        sc.nextLine();
	    }
	    
	    return input;
	}

	// Static method to get a string input from the user
	public static String getString(Scanner sc, String prompt) {
	    System.out.print(prompt);
	    return sc.nextLine();
	}

}