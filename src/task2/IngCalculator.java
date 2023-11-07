package task2;

class EngCalculator extends Calculator {
    public void squareRoot(double a) {
        result = Math.sqrt(a);
    }

    @Override
    public void displayResult() {
        System.out.println("Result of IngCalculator - sqrt: " + result);
    }
}