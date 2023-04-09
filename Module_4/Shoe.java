/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, T. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
public class Shoe extends Product {

// 1. A private double data field named size that specifies the shoe size. The default is 0.
private double size;

// 2. A no-argument constructor that creates a default shoe.
public Shoe() {
this("", "", 0, 0);
}
public Shoe(String code, String description, double price, double size) {
    super(code, description, price);
    this.size = size;
}
// 3. Accessor and mutator methods for the size data field.
public double getSize() {
return size;
}

public void setSize(double size) {
this.size = size;
}

// 4. Override the toString() method. Return an appended string of the superclass with an additional field for the shoe size.
@Override
public String toString() {
return super.toString() + "\n  Size: " + size;
}
}