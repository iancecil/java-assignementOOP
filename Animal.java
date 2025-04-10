/**
 * Abstract Class: Animal
 * - An abstract class cannot be instantiated directly
 * - It can contain both abstract and concrete methods
 * - Subclasses must implement all abstract methods
 */
public abstract class Animal {
    private String name;
    
    // Constructor (abstract classes can have constructors)
    public Animal(String name) {
        this.name = name;
    }
    
    // Abstract method (no implementation)
    public abstract void makeSound();
    
    // Concrete method with implementation
    public void eat() {
        System.out.println(name + " is eating.");
    }
    
    // Another concrete method
    public String getName() {
        return name;
    }
}

