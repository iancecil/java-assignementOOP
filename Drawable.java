/**
 * Interface: Drawable
 * - An interface defines a contract for classes to implement
 * - All methods in an interface are abstract (no implementation)
 * - From Java 8, interfaces can have default and static methods
 */
public interface Drawable {
    // Abstract method (no body)
    void draw();
    
    // Default method (Java 8+ feature)
    default void setColor(String color) {
        System.out.println("Setting color to: " + color);
    }
    
    // Static method (Java 8+ feature)
    static void displayTool() {
        System.out.println("Drawing tool");
    }
}
