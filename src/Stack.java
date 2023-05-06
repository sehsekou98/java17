 class Stack {
     private int stck[];
    private int tos;


     Stack( int size) {
         stck = new int[size];
         tos = -1;
     }

     void push(int item) {
         if (tos == 9)
             System.out.println("Stack is full");
         else
             stck[++tos] = item;
     }

     int pop() {
         if (tos < 0) {
             System.out.println("Stack is underflow");
             return 0;
         } else
             return stck[tos--];


     }
 }
