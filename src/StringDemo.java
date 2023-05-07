//Some string methods
class StringDemo {
    public static void main(String[] args) {
        String str[] = {"John", "Mary", "Jack", "Peter"};
        String strob1 = "My first String.";
        String str0b2 = "My second String.";

        System.out.println("What is the lenght of strob1? " + strob1.length());
        System.out.println("Char at index 3 is: " + strob1.charAt(3));

        for (int i = 0; i<str.length; i++) {
            System.out.println("Str[" + i +  "] is: " + str[i]);
        }
    }
}
