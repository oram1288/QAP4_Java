package QAP4_Java.Problem2;

public class Ellipse extends Shape {
    private double majorAxis;
    private double minorAxis;

    public Ellipse(String name, double majorAxis, double minorAxis) {
        super(name);
        this.majorAxis = Math.max(majorAxis, minorAxis);
        this.minorAxis = Math.min(majorAxis, minorAxis);
    }

    // Perimeter
    public double computePerimeter() {
        double a = majorAxis;
        double b = minorAxis;
        return Math.round (Math.PI * (2 * (Math.sqrt((a * a + b * b) / 2)) - Math.abs(a - b)));
    }

    // Area
    public double computeArea() {
        return Math.round(Math.PI * majorAxis * minorAxis);
    }

    // Override scale method
    public void scale(double factor) {
        this.majorAxis *= factor;
        this.minorAxis *= factor;
    }
}

