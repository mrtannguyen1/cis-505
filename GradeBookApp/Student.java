/**
 Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 	Comprehensive Version (12th ed.). Pearson Education, Inc.
 Nguyen, T. (2023). CIS 505 Intermediate Java Programming. Bellevue University

*/
//student in the gradebook holds the values for firstName, lastName, course, and grade.
class Student {
private String firstName; // First name of the student
private String lastName; // Last name of the student
private String course; // Course of the student
private String grade; // Grade of the student

/**

Default constructor.
*/
public Student() {
}
/**

Parameterized constructor to initialize the Student object with the given properties.
@param firstName First name of the student
@param lastName Last name of the student
@param course Course of the student
@param grade Grade of the student
*/
public Student(String firstName, String lastName, String course, String grade) {
this.firstName = firstName;
this.lastName = lastName;
this.course = course;
this.grade = grade;
}
/**

Get the first name of the student.
@return The first name of the student
*/
public String getFirstName() {
return firstName;
}
/**

Set the first name of the student.
@param firstName The first name of the student
*/
public void setFirstName(String firstName) {
this.firstName = firstName;
}
/**

Get the last name of the student.
@return The last name of the student
*/
public String getLastName() {
return lastName;
}
/**

Set the last name of the student.
@param lastName The last name of the student
*/
public void setLastName(String lastName) {
this.lastName = lastName;
}
/**

Get the course of the student.
@return The course of the student
*/
public String getCourse() {
return course;
}
/**

Set the course of the student.
@param course The course of the student
*/
public void setCourse(String course) {
this.course = course;
}
/**

Get the grade of the student.
@return The grade of the student
*/
public String getGrade() {
return grade;
}
/**

Set the grade of the student.
@param grade The grade of the student
*/
public void setGrade(String grade) {
this.grade = grade;
}
/**

Override the toString() method to provide a string representation of the Student object.
@return A string representation of the Student object
*/
@Override
public String toString() {
return "Name: " + firstName + " " + lastName + "\n" +
"Course: " + course + "\n" +
"Grade: " + grade;
}
}