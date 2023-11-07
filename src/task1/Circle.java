package task1;

import static java.lang.Math.PI;

public class Circle extends Shape {
    private double radius;
    protected String color = "red";

    public Circle(double radius) {
        this.radius = radius;
        this.color=color;
    }
    @Override
    public double calculateArea() {
        double r= PI * radius * radius;
        return  r;
    }
    @Override
    protected void paint(){
        System.out.println("circle area is: " + calculateArea());
        System.out.println("color is: " + color);
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
