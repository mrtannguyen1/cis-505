/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, T. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/


import java.util.Scanner;
//9. Create a new file named TestSportsTeamApp with a main() method to test the Team class.
public class TestSportsTeamApp {
	public static void main(String[] args) {
	//Creating a new instance of the Scanner class to receive  from the user
	Scanner scanner = new Scanner(System.in);
	//Initializing the input variable to "y" to start the program
	String input = "y";
	// Printing a welcome message to the console
	System.out.println("  Welcome to the Sports Team App");
	// Allow the user to enter as many teams and players as they choose by prompting them to decide between continuing or exiting the program.
	// Use a while loop in your programming logic.
	while (input.equalsIgnoreCase("y")) {
		// Prompt the user to enter the team and player names.
		
	    System.out.print("\n  Enter a team name: ");
	    String teamName = scanner.nextLine();
	
	    // For the player names, accept a string of first names, separated by commas without spaces.
	 		
	    System.out.print("\n  Enter the player names \n"
	    		+ "    hint: use commas for multiple playersl no spaces>:");
	    String playerNames = scanner.nextLine();
	    // Splitting the player names string into an array of individual player names
	    String[] players = playerNames.split(",");
	
	  
	    Team team = new Team(teamName);
	    // Adding each player in the players array to the team using the addPlayer method
	    for (String player : players) {
	        team.addPlayer(player);
	    }
	
	    // Use the inputted values to create a new instance of the Team class and use the player names to invoke the addPlayer method.
 		// Display the results on two separate lines using the format “Number of players in team <playerCount>” and “Players on team: <players>.”
	    System.out.println("\n  --Team Summary--");
	    System.out.println("  Number of players in team: " + team.getPlayerCount());
	    System.out.print("  Players on team: ");
	    for (String player : team.getPlayers()) {
	        if (player != null) {
	            System.out.print(player + ",");
	        }
	    }
	    System.out.println();
	
	    // Prompting the user to continue or exit the program
	    System.out.print("\n  Continue? (y/n): ");
	    input = scanner.nextLine();
	}
	
	// Printing a message indicating the end of the program and closing the scanner
	System.out.println("\n  End of line...");
	scanner.close();
	}
}
