/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, T. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
import java.util.ArrayList;
import java.util.List;

public class MemComposerDao implements ComposerDao {
    // #1. A private List data field named composers. The default is a list of composer objects.
    private List<Composer> composers;
    
    // #2. A no-argument constructor that creates a default list of five composer objects.
    public MemComposerDao() {
        this.composers = new ArrayList<>();
        this.composers.add(new Composer(1007, "Ludwig Van Beethoven", "Classical"));
        this.composers.add(new Composer(1008, "Johann Sebastian Bach", "Classical"));
        this.composers.add(new Composer(1009, "Wolfgang Amadeus Mozart", "Classical"));
        this.composers.add(new Composer(1010, "Johannes Brahms", "Classical"));
        this.composers.add(new Composer(1011, "Joseph Haydn", "Classical"));
    }
    
    // #3. An overridden findAll method that returns a list of composer objects.
    @Override
    public List<Composer> findAll() {
        return composers;
    }
    
    // #4. An overridden findBy method that returns a single composer object matching the arguments id.
    @Override
    public Composer findBy(Integer id) {
        for (Composer c : composers) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }
    
    // #5. An overridden insert method that adds a new composer object to the list of composers.
    @Override
    public void insert(Composer composer) {
        composers.add(composer);
    }
}
