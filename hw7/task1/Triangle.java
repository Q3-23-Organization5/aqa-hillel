package task1;

import java.util.Objects;

public class Triangle extends Shape {
    private double a=1, b=2, c=3;

    protected String color = "blue";
    private double base=10;
    private double height=20;

      public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height; // Calculate area of triangle
    }

    @Override
    public void paint(){
        System.out.println("Area of Triangle is: " + calculateArea());
        System.out.println("color is: " + color);
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "color='" + color + '\'' +
                ", base=" + base +
                ", height=" + height +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(base, triangle.base) == 0 && Double.compare(height, triangle.height) == 0 && Objects.equals(color, triangle.color);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, base, height);
    }
}
