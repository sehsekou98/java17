 class Factorial {
     int factor(int n) {
         int result;

         if(n ==1)
             return  1;
         result = factor(n-1) * n;
         return result;

     }
 }

 class Recursion{
     public static void main(String[] args) {
         Factorial factorial = new Factorial();

         System.out.println("factorial of 4 is: " + factorial.factor(4));
         System.out.println("factorial of 5 is: " + factorial.factor(5));
         System.out.println("factorial of 2 is: " + factorial.factor(2));

     }
 }