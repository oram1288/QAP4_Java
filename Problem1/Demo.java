package QAP4_Java.Problem1;

public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("Circle", 5.0);
        shapes[1] = new Ellipse("Ellipse", 4.0, 2.0);
        shapes[2] = new Triangle("Triangle", 3.0, 4.0, 5.0);
        shapes[3] = new EquilateralTriangle("Equilateral Triangle", 6.0);

        for (Shape shape : shapes) {
            System.out.println("");
            System.out.println("----------------------------");
            System.out.println(shape);
            System.out.println("----------------------------");
        }
    }
}
