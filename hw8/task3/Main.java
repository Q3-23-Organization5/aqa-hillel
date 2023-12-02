package task3;
public class Main extends Shape{
    @Override
    protected double calculateArea(){
        return 0;
    }
    @Override
    protected double calculatePerimeter() {
        return 0;
    }
    @Override
    protected void paint() {
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