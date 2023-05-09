package exception;

import java.util.Random;

public class handleError {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Random r = new Random();
        for (int i = 0; i < 3200; i++) {

            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 120 / (b/c);
            } catch (ArithmeticException e) {
                System.out.println("Exception: " + e.getMessage());
                a = 0;
                System.out.println("a: " + a);
            }
        }
    }
}
