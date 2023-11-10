package task2;

class Calculator {
    protected double result;
    public void add(double a, double b) {
        result = a + b;
    }
    public void subtract(double a, double b) {
        result = a - b;
    }
    public void multiply(double a, double b) {
        result = a * b;
    }
    public void divide(double a, double b) {
        if (b != 0) {
            result = a / b;
        } else {
            System.out.println("Error: Division by zero.");
        }
    }
    public void displayResult() {
        System.out.println("Result: " + result);
    }
}

