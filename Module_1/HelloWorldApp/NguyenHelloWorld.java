/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by  T. Nguyen Student 2023
*/ 
public class NguyenHelloWorld {

    /**
     * Method with two arguments, which are used to print Hello World from the user's first and last name.
     * @param firstName String 
     * @param lastName String 
     * @return prints the results to the console window.
     */
    public static void helloWorld(String firstName, String lastName) {
        System.out.printf(String.format("Hello World from %s %s \n", firstName, lastName));
    } // end helloWorld

    public static void main(String[] args) {
        helloWorld("Tan", "Nguyen"); // Call the myName() method with the values "Tan" and "Nguyen."
    } // end main
} // end NguyenHelloWorld
