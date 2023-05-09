package exception;

public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("ThrowsDemo");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Caught: " + e);
        }
    }
}
