public class Main {
    public static void main(String[] args) {
        // Testing Concrete Class
        System.out.println("=== Testing Vehicle (Concrete Class) ===");
        Vehicle car = new Vehicle("Toyota", 2020);
        car.startEngine();
        car.displayInfo();
        
        // Testing Abstract Class and its implementation
        System.out.println("\n=== Testing Animal/Dog (Abstract Class) ===");
        Dog myDog = new Dog("Buddy");
        myDog.makeSound();
        myDog.eat();
        
        // Testing Interface and its implementation
        System.out.println("\n=== Testing Drawable/Circle (Interface) ===");
        Circle myCircle = new Circle(5.0);
        myCircle.draw();
        myCircle.setColor("Red");
        Drawable.displayTool();
        System.out.println("Circle area: " + myCircle.calculateArea());
        
        // Polymorphism example
        System.out.println("\n=== Polymorphism Example ===");
        Animal animal = new Dog("Max");
        animal.makeSound();
        
        Drawable drawable = new Circle(3.0);
        drawable.draw();
    }
}
