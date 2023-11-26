package task1;

import java.util.Objects;

public class Shape {
    protected String color;
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
}