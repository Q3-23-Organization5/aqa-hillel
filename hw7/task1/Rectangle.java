package task1;

import java.util.Objects;

public class Rectangle extends Shape {
    private double a, b, c,d;
    double length = 10;
    double breadth = 20;

    public Rectangle(double a, double b, double c, double d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public Rectangle(){
    };
    protected String color = "white";

    @Override
    public double calculateArea() {
        double res = length*breadth;
        return res;
    }
    @Override
    public void paint(){
        System.out.println("Area of Rectangle is: " + calculateArea());
        System.out.println("color is: " + color);
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breadth=" + breadth +
                ", color='" + color + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(length, rectangle.length) == 0 && Double.compare(breadth, rectangle.breadth) == 0 && Objects.equals(color, rectangle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), length, breadth, color);
    }
}
