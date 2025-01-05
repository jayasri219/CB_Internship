//Abstract class Shape with an abstract method area()
abstract class Shape {
    // Abstract method to calculate the area of the shape
    public abstract double area();
   }
   
   //Rectangle class that extends Shape and implements area()
   class Rectangle extends Shape {
    private double length;
    private double width;
   
    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
   
    // Implementation of the area() method for Rectangle
    @Override
    public double area() {
        return length * width;  // Area of rectangle = length * width
    }
   }
   
   //Circle class that extends Shape and implements area()
   class Circle extends Shape {
    private double radius;
   
    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }
   
    // Implementation of the area() method for Circle
    @Override
    public double area() {
        return Math.PI * radius * radius;  // Area of circle = π * radius^2
    }
   }
   
   public class ShapeAreaCalculation {
    public static void main(String[] args) {
        // Create a Rectangle object with length = 4 and width = 5
        Shape rectangle = new Rectangle(4, 5);
        
        // Create a Circle object with radius = 5
        Shape circle = new Circle(5);
   
        // Calculate and display the area of the rectangle
        System.out.println("Area of Rectangle: " + rectangle.area());
   
        // Calculate and display the area of the circle
        System.out.println("Area of Circle: " + circle.area());
    }
   }
