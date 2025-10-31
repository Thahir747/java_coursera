class Car {
    // Attributes (member variables) define a Car's properties
    String make;
    String model;
    String color;

    // Method (action) to accelerate the Car
    public void accelerate() {
        System.out.println("The car is accelerating!");
    }

    // Method (action) to turn the Car
    public void turn() {
        System.out.println("The car is turning!");
    }
}
public class Main345 {
    public static void main(String[] args) {
     
   // Create a red Colorado
        Car colorado = new Car();
        colorado.make = "Chevrolet";
        colorado.model = "Colorado";
        colorado.color = "Red";
        
        // Create a blue Mustang
        Car mustang = new Car();
        mustang.make = "Ford";
        mustang.model = "Mustang";
        mustang.color = "Blue";

       // Make the colorado accelerate
       colorado.accelerate();

       // Make the mustang turn
        mustang.turn();
    }
}