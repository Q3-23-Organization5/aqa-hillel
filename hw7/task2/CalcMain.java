package task2;

import java.util.Scanner;
public class CalcMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Engineering Calculator
        EngCalculator engCalculator = new EngCalculator();
        System.out.print("Enter a number for square root calculation: ");
        double num = scanner.nextDouble();
        engCalculator.squareRoot(num);
        engCalculator.displayResult();


        // Programmable Calculator
        ProgrCalculator progCalculator = new ProgrCalculator();
        double[] values = { 5.0, 7.0, 12.0, 3.0 };
        progCalculator.calculateAverage(values);
        progCalculator.displayResult();
    }
}