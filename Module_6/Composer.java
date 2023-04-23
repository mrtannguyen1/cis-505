/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, T. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
public class Composer {
    // #1. A private integer data field named id. The default is an empty string.
    private int id;
    // #2. A private string data field named name. The default is an empty string.
    private String name;
    // #3. A private string data field named genre. The default is an empty string.
    private String genre;
    
    // #4. A no-argument constructor that creates a default composer.
    public Composer() {
        this.id = 0;
        this.name = "";
        this.genre = "";
    }
    
    // #5. An argument constructor that creates a composer using all three data fields.
    public Composer(int id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }
    
    // #6. Accessor methods for all three data fields.
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    // #7. Override the toString method. Return a string description of a composer with all three data fields, on separate lines.
    @Override
    public String toString() {
        return "  Id: " + id + "\n  Name: " + name + "\n  Genre: " + genre;
    }
}
