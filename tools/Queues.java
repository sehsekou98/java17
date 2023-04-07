package tools;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    public static void main(String[] args){
        Queue<String> fruits = new LinkedList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        System.out.println(fruits);
        System.out.println(fruits.peek());



    }
}
