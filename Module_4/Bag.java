/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, T. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
// 1. A private string data field named type that specifies the number of bowling balls the bag can hold. The default is an empty string.
public class Bag extends Product {
private String type;

// 2. A no-argument constructor that creates a default bag.
public Bag() {
this("", "", 0, "");
}
public Bag(String code, String description, double price, String type) {
    super(code, description, price);
    this.type = type;
}
// 3. Accessor and mutator methods for the type data field.
public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}

// 4. Override the toString() method. Return an appended string of the superclass with an additional field for the bag's type.
@Override
public String toString() {
return super.toString() + "\nType: " + type;
}
}



