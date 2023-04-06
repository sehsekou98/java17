package tools;

public class Animals {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.makeSound(); // Output: The animal makes a sound
        myDog.makeSound(); // Output: The dog barks
        myCat.makeSound(); // Output: The cat meows
    }
}
