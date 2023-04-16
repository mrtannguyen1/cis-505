/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, T. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
// This code defines a class named Transaction with private fields, constructors, accessor and mutator methods,
// and an overridden toString method.

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transaction {
// #1 A private string data field named date that specifies the date of a transaction. The default value is today’s date formatted as “MM-dd-yyyy”
private String date = LocalDate.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
private String description = "";
private double amount = 0;
//#4 Accessor methods for all three data fields
public String getDate() {
 return date;
}

public String getDescription() {
 return description;
}

public double getAmount() {
 return amount;
}

//#4 Mutator methods for all three data fields
public void setDate(String date) {
 this.date = date;
}

public void setDescription(String description) {
 this.description = description;
}

public void setAmount(double amount) {
 this.amount = amount;
}

//#5 No-argument constructor for default transaction
public Transaction() {
 setDate(LocalDate.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy")));
 setDescription("");
 setAmount(0);
}

//#6 Argument constructor for transaction with all three data fields
public Transaction(String date, String description, double amount) {
 setDate(date);
 setDescription(description);
 setAmount(amount);
}

//#7 Override toString method for string representation of transaction
@Override
public String toString() {
 return String.format("\n  Date: " + getDate() +
         "\n  Description: " + getDescription() +
         "\n  Amount: $%,6.2f", getAmount());
}
}
