class Calculator {
    public void add(int a, int b) {
        int sum = a + b;
        System.out.println("sum is " + sum);
    }

    public void add(double a, double b) {
        double sum = a + b;
        System.out.println("sum is " + sum);
    }

    public void add(int a, int b, long c) {
        long sum = a + b + c;
        System.out.println("sum is " + sum);
    }

}

public class PolymorphismExample1 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(5, 6);
        calculator.add(5.5, 6.6);
        calculator.add(5, 6, 853);
    }
}