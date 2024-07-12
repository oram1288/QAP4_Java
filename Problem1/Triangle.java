package QAP4_Java.Problem1;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        if (isValidTriangle(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            System.out.println("Error: Invalid sides for a triangle.");
            System.exit(1);
        }
    }

    private boolean isValidTriangle(double side1, double side2, double side3) {
        return (side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side1 > side2);
    }

    // Perimeter
    public double computePerimeter() {
        return Math.round (side1 + side2 + side3);
    }

    // Area
    public double computeArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.round (Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)));
    }
}
