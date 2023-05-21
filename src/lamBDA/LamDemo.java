package lamBDA;


interface NumericTest {
    boolean test(int i, int j);
}

interface NumericTest2 {
    boolean test2(int k, int v);
}
public class LamDemo {
    public static void main(String[] args) {
        NumericTest isFactor = (i, j) -> (i % j) == 0;

        NumericTest2 isNotFactor = (k, v) -> (k % v) == 0;

        if (isFactor.test(30, 3))
            System.out.println("3 is a factor of 30");

        if (!isFactor.test(30, 3))
            System.out.println("3 is not the factor of 30");

        if (isNotFactor.test2(31, 2))
            System.out.println("2 is the factor of 31");
        if (!isNotFactor.test2(31, 2))
            System.out.println("2 is not the factor of 31");
    }
}
