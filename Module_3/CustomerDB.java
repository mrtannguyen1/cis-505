/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, T. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/

// Create CustomerDB
public class CustomerDB {
    
    /**
     * A public static method named getCustomer with an Integer argument named id and a
     * return type of Customer. Using an if…else if…else if…else statement, compare the
     * argument id data field against the values 1007, 1008, and 1009. For each match, return a
     * new customer object with unique fields. If there are no matches, return a default
     * customer object.
     */
    public static Customer getCustomer(Integer id) {
        
        // check if id matches 1007 and return a new customer object with unique fields
        if (id == 1007) {
            return new Customer("Jennifer Patterson", "8422 Grover Ave.", "Bellevue", "68123");
        }
        // check if id matches 1008 and return a new customer object with unique fields
        else if (id == 1008) {
            return new Customer("Sam Smith", "10 Fire St", "Omaha", "68102");
        }
        // check if id matches 1009 and return a new customer object with unique fields
        else if (id == 1009) {
            return new Customer("Jose Lee", "348 Atlantic Ave", "New York", "10022");
        }
        // if no matches found, return a default customer object
        else {
            return new Customer();
        }
    }
} // End CustomerDB Class