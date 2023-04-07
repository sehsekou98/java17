package tools;

import java.util.HashSet;
import java.util.Set;

// Data structure of type set.
public class Sets {

    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        System.out.println(fruits);
        System.out.println(fruits.size());


        //adding fruits in the list
        Set<String> moreFruits = Set.of("lemon", "coconut");
        System.out.println(moreFruits);
    }
}
