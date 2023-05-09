package exception;

 class FinallyDemo {
    static  void procA(){
        try {
            System.out.println("inside procA");
            throw new RuntimeException("finally");
        } finally {
            System.out.println("outside procA");
        }
    }

    static void procB(){
        try {
            System.out.println("inside procB");
            return;
        } finally {
            System.out.println("outside procB");
        }
    }

    static void procC(){
        try {
            System.out.println("inside procC");
        } finally {
            System.out.println("outside procC");
        }
    }

     public static void main(String[] args) {
         try {
             procA();
         } catch (Exception e) {
             System.out.println("Exception caught");
         }
         procB();
         procC();
     }
}
