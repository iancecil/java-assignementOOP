/**
 * Concrete class implementing Drawable interface
 * Must implement all abstract methods from Drawable
 */
public class Circle implements Drawable {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
