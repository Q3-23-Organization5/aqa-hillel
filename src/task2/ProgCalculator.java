package task2;

class ProgrCalculator extends Calculator {
    public void calculateAverage(double[] values) {
        for (int i = 0; i < values.length; i++) {
            result = result+values[i];
        }
    }
    @Override
    public void displayResult() {
        System.out.println("Result of ProgCalculator sum of array elements: " + result);
    }
}

