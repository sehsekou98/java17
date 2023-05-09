package exception;

public class ThrowDemo {
    static void demopro() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Error: " + e);
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demopro();
        } catch (NullPointerException e) {
            System.out.println("Recaught: " + e);
        }
    }
}
