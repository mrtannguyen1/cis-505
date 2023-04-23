/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, T. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
import java.util.Scanner;

public class TestComposerApp {

    private static MemComposerDao composerDao = new MemComposerDao();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = 0;
        //#1. The code prompts the user with a menu of options using a while loop and a switch statement. The menu options are displayed using println statements and the user's choice is read using a Scanner object.

        System.out.println("  Welcome to the Composer App");
        while (option != 4) {
            System.out.println("\n  MENU OPTIONS");
            System.out.println("    1. View Composers");
            System.out.println("    2. Find Composer");
            System.out.println("    3. Add Composer");
            System.out.println("    4. Exit");
            System.out.print("\n  Please choose an option: ");
            option = input.nextInt();
            input.nextLine(); // consume the newline character

            switch (option) {
                case 1:
                    listComposers();
                    break;
                case 2:
                    findComposerById(input);
                    break;
                case 3:
                    addNewComposer(input);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }
        }
    }
    //#2. If the user selects option one, the code calls the listComposers() method which displays all the composers using the MemComposerDao class's findAll() method.
    private static void listComposers() {
        System.out.println("\n  --DISPLAYING COMPOSERS--");
        for (Composer composer : composerDao.findAll()) {
            System.out.println(composer +"\n");
        }
    }
   //#3. If the user selects option two, the code calls the findComposerById() method which prompts the user to enter an id and then uses the MemComposerDao class's findBy() method to find the composer object and display it to the user.
    private static void findComposerById(Scanner input) {
        System.out.print("\n  Enter an id: ");
        int id = input.nextInt();
        Composer composer = composerDao.findBy(id);
        if (composer == null) {
            System.out.println("Composer not found.");
        } else {
        	System.out.println("\n  --DISPLAYING COMPOSERS--");
            System.out.println(composer);
        }
    }
    //#4. If the user selects option three, the code calls the addNewComposer() method which prompts the user to enter the id, name, and genre of the new composer and then uses the MemComposerDao class's insert() method to add the new composer to the list.
    
    private static void addNewComposer(Scanner input) {
    	System.out.print("\n  Enter an id: ");
        String id = input.nextLine();
        System.out.print("  Enter a name: ");
        String name = input.nextLine();
        System.out.print("  Enter a genre: ");
        String genre = input.nextLine();
        Composer newComposer = new Composer(Integer.parseInt(id), name, genre);
        composerDao.insert(newComposer);
    }
}
