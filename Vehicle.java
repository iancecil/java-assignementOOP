/**
 *         Concrete Class: Vehicle
 * - A concrete class is a complete class that can be instantiated
 * - It provides implementations for all its methods
 * - No abstract methods are allowed in a concrete class
 */
public class Vehicle {
    private String brand;
    private int year;
    
    // Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    
    // Concrete method with implementation
    public void startEngine() {
        System.out.println("The " + brand + " engine is starting...");
    }
    
    // Another concrete method
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
    
    // Getter methods
    public String getBrand() {
        return brand;
    }
    
    public int getYear() {
        return year;
    }
}
