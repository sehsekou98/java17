package lamBDA;


interface MyNumber{
    double getValue();
}
public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNum;

        myNum = () -> 125.99;

        System.out.println(myNum.getValue());

        myNum = () -> Math.random() * 100;
        System.out.println(myNum.getValue());


    }
}
