package QAP4_Java.Problem1;

public class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    // Perimeter
    public double computePerimeter() {
        return Math.round (2 * Math.PI * radius);
    }

    // Area
    public double computeArea() {
        return Math.round (Math.PI * radius * radius);
    }
}
