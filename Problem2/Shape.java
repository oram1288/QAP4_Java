package QAP4_Java.Problem2;

public abstract class Shape implements Scalable {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double computePerimeter();
    
    public abstract double computeArea();

    // toString method
    public String toString() {
        return "Shape: " + name + "\nArea: " + computeArea() + "\nPerimeter: " + computePerimeter();
    }
}
