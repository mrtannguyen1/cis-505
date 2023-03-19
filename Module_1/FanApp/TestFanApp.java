import com.test.helpers.A;

/*
   Nguyen, T. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/ 

/*  #10 Create a new file named TestFanApp with a main() method to test the Fan class. Create
two instances of the Fan class, one using the default constructor and the other using the
argument constructor. For the second argument constructor, use the classes constants to
set the speed. Display the objects by invoking the classes toString() method. 
*/
import java.util.*;

// Define a public class named TestFanApp
public class TestFanApp {
    public static void main(String[] args) {
        // Create a default fan using the no-argument constructor
        Fan option1 = new Fan();
        // Create a fan with specific properties using the argument constructor
        Fan option2 = new Fan(Fan.MEDIUM, true, 8, "blue");        
        // Display the properties of fan1 and fan2 using the toString method
        System.out.println(option1.toString());
        System.out.println(option2.toString());
    }// end main
}// end TestFanApp
