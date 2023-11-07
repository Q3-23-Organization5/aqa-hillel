package homework6;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(10,20);
        calculator.substraction(30,20);
        calculator.mult(5,20);
        calculator.div(50,10);
        System.out.printf("You are welcome!");
    }
}