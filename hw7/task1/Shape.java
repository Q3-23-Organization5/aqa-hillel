package task1;

import java.util.Objects;

public class Shape {
    protected String color;
   // private double x;
   // private double y;

  //  public double getX() {
  //     return x;
    //}
 //   public double getY() {
  //      return y;
 //   }
    protected double calculateArea(){
        return 0;
    }
    protected double calculatePerimeter(){
        return 0;
    };
    protected void paint(){
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
   /* public static void main(String[] args) {
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle(5,9);

        Shape[] shapesArray = {circle, triangle,rectangle};
        for (Shape shape : shapesArray){
            shape.calculateArea();
            shape.paint();
            System.out.println("ToString info: " + shape.toString());
        }
    }*/
}