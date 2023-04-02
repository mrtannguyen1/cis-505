/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, T. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Create Account class
public class Account {

    // 1. A private double data field named balance. The default is 200.
    private double balance = 200;

    // 2. An accessor method for the balance data field.
    public double getBalance() {
        return balance;
    }

    // 3. A public method named deposit with a double argument named amt and a return type of
    // void. Increase the running total of the balance data field using the methods argument.
    public void deposit(double amt) {
        balance += amt;
    }

    // 4. A public method named withdraw with a double argument named amt and a return type
    // of void. If the balance data field is greater than or equal to the argument, decrease the
    // running total of the balance field using the methods argument.
    public void withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
        }
    }

    // 5. A public method named displayMenu with a return type of void. Print a menu matching.
    public void displayMenu() {
        System.out.println("\n  Account Menu");
        System.out.println("  Enter <D/d> for deposit");
        System.out.println("  Enter <W/w> for withdraw");
        System.out.println("  Enter <B/b> for balance");
    }

    // 6. A public method named getTransactionDate with a return type of string. Return a date
    // using the format MM-dd-yyyy.
    public String getTransactionDate() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        return date.format(formatter);
    }
} //End Account class
