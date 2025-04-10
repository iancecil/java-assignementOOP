/**
 * Concrete class extending Animal abstract class
 * Must implement all abstract methods from Animal
 */
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof woof!");
    }
}
