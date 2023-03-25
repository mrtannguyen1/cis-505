/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, T. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/

public class Team {
     // 1. A private string data field named teamName that specifies the teams name. The default is an empty string.
    private String teamName;

    // 2. A private string array data field named players that specifies the players assigned to a team. The default size is 20.
    private String[] players = new String[20];

    // 3. A private int data field named playerCount that specifies the number of players on a team. The default is 0.
    private int playerCount;

    // 4. An argument constructor that creates a team using the teamName data field as an argument.
    public Team(String teamName) {
        this.teamName = teamName;
    }

    // 5. A public method named addPlayer with a string argument that adds a player to the players data field.
    public void addPlayer(String playerName) {
        players[playerCount] = playerName;
        playerCount++;
    }

    // 6. A public string array method named getPlayers that returns the players data field.
    public String[] getPlayers() {
        // Create a new string array of size playerCount to store the players.
        String[] result = new String[playerCount];
        // Loop through the players array and add each player to the result array.
        for (int i = 0; i < playerCount; i++) {
            result[i] = players[i];
        }
        // Return the result array.
        return result;
    }

    // 7. A public int method named getPlayerCount that returns the playerCount data field.
    public int getPlayerCount() {
        return playerCount;
    }

    // 8. A public string method named getTeamName that returns the teamName data field.
    public String getTeamName() {
        return teamName;
    }
} //End Team class
