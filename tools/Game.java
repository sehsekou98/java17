package tools;

//Polymorphism
class  A
{
    public void boy(){
        System.out.println("the boys are coming");
    }
}

class B extends A {
    public void boy(){
        System.out.println("The boys are coming as well");
    }
}

public class Game {
    public static void main(String[] args) {

     A obj = new A();
     obj.boy();

     obj = new B();
     obj.boy();

    }
}