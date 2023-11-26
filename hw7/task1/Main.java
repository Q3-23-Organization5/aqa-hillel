package task1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle(5,9);

        Shape[] shapesArray = {circle, triangle,rectangle};
        for (Shape shape : shapesArray){
            shape.calculateArea();
            shape.paint();
            System.out.println("ToString info: " + shape.toString());
        }
    }
}
