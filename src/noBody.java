public class noBody {
    public static void main(String[] args) {
        Box box = new Box(10, 20, 30);
        Box box2 = new Box(3, 10, 30);
        Box box3 = new Box(4, 20, 15);
        double vol;

        box.volume();
        box2.volume();
        box3.volume();

        vol = box.volume();
        System.out.println(" Volume of box1 : " + vol);

        vol = box2.volume();
        System.out.println(" Volume of box1 : " + vol);

        vol = box3.volume();
        System.out.println(" Volume of box1 :" + vol);




        Human human = new Human("Sekou", 20, "Male", "123@gmailcom");
        Human human1 = new Human("John", 25, "Male", "john@gmail.com");
        Human human2 = new Human("Mary", 30, "Female", "mary@gmail.com" );

        System.out.println("Name: " + human.name + "Age:  " + human.age + " " + "Sex: " + human.sex + " " + "Email: " + human.email);
        System.out.println("Name: " + human1.name + " " + "Age: " + human1.age + " " + "Sex: " + human1.sex + " " + "Email: " + human1.email);
        System.out.println("Name: " + human2.name + " " + "Age: " + human2.age + " " + "Sex: " + human2.sex + " " + "Email" + human2.email);

        Phone phone = new Phone("Iphone", 2999.9, "Prom-max");
        Phone phone1 = new Phone("Nokia", 599.99, "Nokia-360");

        System.out.println("Phone:"  + phone.name + " " + "Price: " + phone.price + " " + "Model: " + phone.model);
        System.out.println( "Phone: " + phone1.name + " " + "Price: " + phone1.price + " " + "Model: " + phone1.model);

        Stack myStack = new Stack();
        Stack myStack1 = new Stack();

        // push some numbers in the stack
        for (int i = 0; i < 10; i++) myStack.push(i);
        for (int i = 10; i < 20; i++) myStack1.push(i);

        //pop out numbers off the stack
        for (int i = 0; i < 10; i++)
            System.out.println(myStack.pop());

        for (int i = 0; i < 10; i++)
            System.out.println(myStack1.pop());




    }


}