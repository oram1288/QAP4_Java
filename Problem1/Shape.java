package QAP4_Java.Problem1;

public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double computePerimeter();
    
    public abstract double computeArea();

    // toString method
    public String toString() {
        return "Shape: " + name + "\nPerimeter: " + computePerimeter() + "\nArea: " + computeArea();
    }
}
