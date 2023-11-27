package task3;

import java.util.Objects;

public abstract class Shape {
    protected String color;
    private double x;
    private double y;

    public double getX() {

        return x;
    }
    public double getY() {

        return y;
    }
    protected abstract double calculateArea(){
        return 0;
    };
    protected abstract double calculatePerimeter(){
        return 0;
    };
    protected abstract void paint(){
    };
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        super.equals(o);
        return Objects.equals(color, shape.color);
    }
    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle(5,9);

        Shape[] shapesArray = {circle, triangle,rectangle};
        for (Shape shape : shapesArray){
            shape.calculateArea();
            shape.paint();

        }
    }
}
