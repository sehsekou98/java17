package tools;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("plum");
        fruits.set(0, "grape");
        fruits.add("orange1");

        System.out.println(fruits);

        System.out.println(fruits.get(2));

        System.out.println(fruits.indexOf("orange1"));
    }
}
