package tools;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum1 = calculator.add(5, 10);
        double sum2 = calculator.add(3.14, 2.71);
        int sum3 = calculator.add(2, 3, 4);
        System.out.println("Sum of integers: " + sum1);
        System.out.println("Sum of doubles: " + sum2);
        System.out.println("Sum of three integers: " + sum3);
    }
}
