package exception;

public class MultiCatch {
    public static void main(String[] args) {
        int i =10 , j = 0;
        int count[] = {1, 2, 3};
        try {
            int result = i/j;
            count[10] = 19;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught " + e);
        }
        System.out.println("Exist");
    }
}
