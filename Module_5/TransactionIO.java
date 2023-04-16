import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
// Defining a public class named TransactionIO
public class TransactionIO {
//#1 Defining a private static final String constant named FILE_NAME with a value of "expenses.txt"
private static final String FILE_NAME = "expenses.txt";
//#2 Defining a private static File variable named file that is initialized to a new File object with a name of FILE_NAME
private static File file = new File(FILE_NAME);
/**
 * #3 A public static method named bulkInsert with an ArrayList<Transaction> argument named transactions
 * and a return type of void. This method throws an IOException.
 *
 * In the body of the function, create a new PrintWriter variable named output and set the default value to null.
 * Using an if…else statement, check if the file exists.
 * For true comparisons, assign a new PrintOutStream to the output variable.
 * For false comparison, set output to a new PrintWriter instance using the FILE_NAME constant.
 *
 * Finally, iterate over the transactions argument and write the objects to the file using the output.print
 * and output.println() methods.
 *
 * @param transactions ArrayList of Transaction objects to be written to the file
 * @throws IOException if there is an issue with file IO
 */
public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException {
    // Initializing a PrintWriter object named output to null
    PrintWriter output = null;
    // Checking if the file exists
    if (file.exists()) {
        // If the file exists, initialize the PrintWriter object named output to write to the existing file
        output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true));
    } else {
        // If the file does not exist, initialize the PrintWriter object named output to write to a new file with the name of FILE_NAME
        output = new PrintWriter(FILE_NAME);
    }
    // Looping through each Transaction object in the ArrayList named transactions
    for (Transaction tran : transactions) {
        // Writing the date, description, and amount of the current Transaction object to the PrintWriter object named output
        output.print(tran.getDate() + " ");
        output.print(tran.getDescription() + " ");
        output.print(tran.getAmount() + " ");
        output.println();
    }
    // Closing the PrintWriter object named output
    output.close();
}

/**
 * #4 A public static method named findAll with a return type of ArrayList<Transaction>.
 * This method throws an IOException.
 *
 * In the body of the method, open the expenses.txt file, iterate over the lines,
 * and return an ArrayList of transactions.
 *
 * @return ArrayList of Transaction objects read from the file
 * @throws IOException if there is an issue with file IO
 */
public static ArrayList<Transaction> findAll() throws IOException {
    // Initializing an ArrayList of Transaction objects named transactions
    ArrayList<Transaction> transactions = new ArrayList<>();
    // Initializing a Scanner object named input to read from the file
    Scanner input = new Scanner(file);
    // Looping through each line in the file
    while (input.hasNext()) {
        // Reading the next line of the file into a String variable named line
        String line = input.nextLine();
        // Splitting the line into an array of String tokens based on whitespace
        String[] tokens = line.split(" ");
        // Creating a new Transaction object using the date, description, and amount from the tokens array
        Transaction transaction = new Transaction(tokens[0], tokens[1], Double.parseDouble(tokens[2]));
        // Adding the new Transaction object to the transactions ArrayList
        transactions.add(transaction);
    }
    // Closing the Scanner object named input
    input.close();
    // Returning the transactions ArrayList
    return transactions;
}
   
}