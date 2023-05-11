package Enumeration;

public enum Human {
    Sekou(20), John(18), Mary(15), Peter(10);
    private final Integer age;

    //constructor
    Human(Integer a) {age = a;}
    Integer getAge(){
        return age;
    }
}

class  EnumDemo{
    public static void main(String[] args) {
        Human apple;
        System.out.println("Sekou : " + Human.Sekou.getAge());


        //Display all ages
        for (Human h : Human.values())
        System.out.println(h + " : " + h.getAge());







    }
}
