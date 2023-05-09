package exception;

public class MyException extends Exception{
    private final int detail;

    MyException(int i) {
        detail = i;
    }
    public String toString() {
        return "MyException[" + detail + "]";
    }
}

class ExceptionDemo {
    static void compute(int i) throws MyException {
        System.out.println("compute(" + i + ")");
        if (i > 10)
            throw new MyException(i);
        System.out.println("Exist");
    }

    public static void main(String[] args) {
        try {
            compute(2);
            compute(30);
        } catch (MyException e) {
            System.out.println("Caught " + e);
        }
    }
}