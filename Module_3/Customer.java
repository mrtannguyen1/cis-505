/*
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, T. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/

// Create customer class
public class Customer {
	//1. A private string data field named name that specifies the name of a customer.
	private String name;    

	//2. A private string data field named address that specifies the address of a customer.
	private String address; 

	//3. A private string data field named city that specifies the city of a customer.
	private String city;    

	//4. A private string data field named zip that specifies the zip code of a customer.
	private String zip;     

	//5. A no-argument constructor that creates a default customer.
	public Customer() {
	    name = "";
	    address = "";
	    city = "";
	    zip = "";
	}

	//6. An argument constructor that creates a customer using the four data fields.
	public Customer(String name, String address, String city, String zip) {
	    this.name = name;
	    this.address = address;
	    this.city = city;
	    this.zip = zip;
	}

	//7. Accessor methods for all four data fields.
	public String getName() {
	    return name;
	}

	public String getAddress() {
	    return address;
	}

	public String getCity() {
	    return city;
	}

	public String getZip() {
	    return zip;
	}

	//8. Override the toString() method. Return a string description for a customer with all four fields, on separate lines.
	@Override
	public String toString() {
	    return String.format("--Customer Details--\n  Name: %s\n  Address: %s\n  City: %s\n  Zip: %s\n",
	        name, address, city, zip);
	}

}// End Customer Class