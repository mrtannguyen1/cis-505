/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, T. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
public class Ball extends Product {

// 1. A private string data field named color that specifies the color of a bowling ball. The default is an empty string.
private String color;

// 2. A no-argument constructor that creates a default ball.
public Ball() {
this("", "", 0, "");
}
public Ball(String code, String description, double price, String color) {
    super(code, description, price);
    this.color = color;
}
// 3. Accessor and mutator methods for the color data field.
public String getColor() {
return color;
}

public void setColor(String color) {
this.color = color;
}

// 4. Override the toString() method. Return an appended string of the superclass with an additional field for the bowling ball's color.
@Override
public String toString() {
return super.toString() + "\n  Color: " + color;
}
}