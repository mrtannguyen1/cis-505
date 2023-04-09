/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, T. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/
public class Product {
// 1. A private string data field named code that specifies the product code. The default value is an empty string.
private String code;

// 2. A private string data field named description that specifies the product's description. The default value is an empty string.
private String description;

// 3. A private double data field named price that specifies the price of a product. The default value is 0.
private double price;

// 4. A no-argument constructor that creates a default product.
public Product() {
this("", "", 0);
}

// 5. Accessor and mutator methods for all three data fields.
public Product(String code, String description, double price) {
    this.code = code;
    this.description = description;
    this.price = price;
}
public String getCode() {
return code;
}

public void setCode(String code) {
this.code = code;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}

public double getPrice() {
return price;
}

public void setPrice(double price) {
this.price = price;
}

// 6. Override the toString() method. Return a description of the product with all three fields on separate lines.
@Override

public String toString() {
    return String.format("  Product code: %s\n  Description: %s\n  Price: $%,6.2f", code, description, price);
}
}