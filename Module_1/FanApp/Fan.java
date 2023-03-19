/*
 Nguyen, T. (2023). CIS 505 Intermediate Java Programming. Bellevue University
*/ 
// Define a public class named Fan
package Fanapp;
public class Fan {
 // #1 Define Four constants named STOPPED, SLOW, MEDIUM, and FAST with values 0, 1, 2, and 3 to represent the fans speed.
 public static final int STOPPED = 0;
 public static final int SLOW = 1;
 public static final int MEDIUM = 2;
 public static final int FAST = 3;
 /*
  #2 Define A private int data field named speed that specifies the speed of the fan. 
  #3 Define A private boolean data field named on that specifies whether the fan is on or off. 
  #4 Define A private double data field named radius that specifies the radius of the fan.
  #5 Define A private string data field named color that specifies the color of the fan. 
 */
 private int speed;
 private boolean on;
 private double radius;
 private String color;
 
 /*
  #2 Use the constants and set the default speed to STOPPED. 
  #3 The fan is off.(default)
  #4 The radius is 6. (default)
  #5 The color is white. (default)
  #7 Define A no-argument constructor that creates a default fan (set all fields to their default values). 
  */
 public Fan() {
  this.speed = STOPPED;
  this.on = false;
  this.radius = 6;
  this.color = "white";
 }
 
 // #8 Define an argument constructor that creates a fan using the four fields as arguments
 public Fan(int speed, boolean on, double radius, String color) {
  this.speed = speed;
  this.on = on;
  this.radius = radius;
  this.color = color;
 }
 // #6 Accessor and mutator methods for all four data fields. 
 // Define getter method for fan speed
 public int getSpeed() {
  return this.speed;
 }
 
 // Define setter method for fan speed
 public void setSpeed(int speed) {
  this.speed = speed;
 }
 
 // Define getter method for on/off state
 public boolean isOn() {
  return this.on;
 }
 
 // Define setter method for on/off state
 public void setOn(boolean on) {
  this.on = on;
 }
 
 // Define getter method for fan radius
 public double getRadius() {
  return this.radius;
 }
 
 // Define setter method for fan radius
 public void setRadius(double radius) {
  this.radius = radius;
 }
 
 // Define getter method for fan color
 public String getColor() {
  return this.color;
 }
 
 // Define setter method for fan color
 public void setColor(String color) {
  this.color = color;
 }
 
 //#9 Override toString method Return a string description for the fan. If the fan is on, the method returns the fan speed, color, and radius in a combined string. If the fan is not on, the method returns the fan color, radius, and a message of “fan is off” in a combined string
 @Override
 public String toString() {
  // If fan is on, return The fan speed is set to <speed> with a color of <color> and a radius of <radius>
  if (this.on) {
   return "The fan speed is set to " + this.speed + " with a color of " + this.color + " and a radius of " + this.radius;
  } 
	else {
   // If fan is off, return The fan is <color> with a radius of <radius> and the fan is off
   return "The fan is " + this.color + " with a radius of " + this.radius + " and the fan is off";
  }
 }
}// End Fan
