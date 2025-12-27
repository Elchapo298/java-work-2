/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author Wandi Mtshali
 */
public class DataStructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* List<Integer> numbers = new ArrayList<>();
        if (numbers.isEmpty()) {
            
        

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        numbers.forEach(System.out::println);
        int removedElemets = numbers.remove(4);
        System.out.println("the element " + removedElemets + " has been removed");
        numbers.forEach(System.out::println);

        int element = numbers.get(0);
        System.out.println("the element at indexed 0 is " + element);
        numbers.forEach(System.out::println);

        System.out.println(" Element at index 0 is now changed to 10");
        numbers.add(0, 10);
        numbers.forEach(System.out::println);

        System.out.println(" element at index 0 replaced with 20 ");
        numbers.set(0, 20);
        numbers.forEach(System.out::println);

        if (numbers.contains(20)) {

            System.out.println(20 + "is present is the list. it occers at index " + numbers.indexOf(20));
        } else {

            System.out.println(20 + " is not the list");

        }
        numbers.clear();

        if (numbers.isEmpty()) {
            System.out.println("the line is empty");

        } else {

            System.out.println("the list is not empty.");

        }
        }else{
        
        
        
            System.out.println("the list not empty");
        
        }

        int size, topNum, prppedTopNum, index;
        Stack<Integer> numbers = new Stack<>();

        if (numbers.isEmpty()) {

            System.out.println("the stack is empty. add elemts to the stack");
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);

            System.out.println("the following elemts have been added to the stack: " + numbers);

            for (Integer number : numbers) {
                System.out.println(number + "is at index " + numbers.indexOf(number) + "of the stack");
            }
            size = numbers.size();

            topNum = numbers.peek();
            System.out.println("\nThe number at the top of the stack is " + topNum);
            System.out.println(" the size of the stack is " + numbers.size());

            for (Integer number : numbers) {
                System.out.println(number + " is at index  " + numbers.indexOf(number) + "of the stack.");
            }
            numbers.push(9);
            numbers.push(10);
            System.out.println("\n9 and 10 have been added to the stack.");

            for (Integer number : numbers) {
                System.out.println(number + "is at index " + numbers.indexOf(number) + "of the stack.");

            }

            topNum = numbers.peek();
            System.out.println("\nThe number at the top of the stack is " + topNum);
            System.out.println("the size of the stack is " + numbers.size());

            index = numbers.search(10);

            if (index != -1) {

                System.out.println("\n" + 10 + "has been found at index" + index);
            } else {

                System.out.println("\n" + 10 + "was not found at stack.");

            }
            System.out.println("\nThe first element is " + numbers.firstElement());

            System.out.println("the last element is " + numbers.lastElement());

            numbers.clear();

            if (numbers.isEmpty()) {
                System.out.println("\nthe stack is empty");
            } else {

                System.out.println("\nthe stack is not empty.the are " + numbers.size() + "element in the stack");
            }

        } else {

            System.out.println("\nthe stack is not empty");
        }

        Queue<Integer> numbersQueue = new LinkedList<>();

        if (numbersQueue.isEmpty()) {
            System.out.println("The queue is empty.");

            numbersQueue.add(1);
            numbersQueue.add(2);
            numbersQueue.add(3);
            numbersQueue.add(4);
            numbersQueue.add(5);

            System.out.println("the elements have been added"
                    + "\n the size od the queue is " + numbersQueue.size());

            for (Integer integer : numbersQueue) {
                System.out.println(integer + " is in the queue");
            }
            System.out.println("\nthe first elemet is " + numbersQueue.element());
            System.out.println("the size of the queue is " + numbersQueue.size());

            for (Integer integer : numbersQueue) {
                System.out.println(integer + " is in the queue");
            }
            
            System.out.println("\nthe firts element is "+numbersQueue.poll());

            System.out.println("the size of the queue is "+numbersQueue.size());
        
            for (Integer integer : numbersQueue) {
                System.out.println(integer +" is in the queue");
            }
            numbersQueue.offer(9);
            numbersQueue.offer(10);
            
            System.out.println("\n9 and 10 have been added to the queue");
            System.out.println("\nthe first elemet is "+numbersQueue.peek());
            System.out.println("the size of the queue is "+numbersQueue.size());
            
            for (Integer integer : numbersQueue) {
                System.out.println(integer+ "is in the queue");
            }
            
            if (numbersQueue.contains(6)) {
                System.out.println(6+" is found in the queue");
            }else{
                System.out.println(6+" is not in the queue");
            
            }
            numbersQueue.clear();
            
            if (numbersQueue.isEmpty()) {
                System.out.println("\nthe queue is empty");
            } else {

                System.out.println("\nthe queue is not empty.the are " + numbersQueue.size() + "element in the queue");
            }
    


        }
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        System.out.println("there are " + set.size() + "element in the set ");
        System.out.println(set);

        boolean outcome = set.add(5);
        System.out.println("\nis the duplicate added? " + outcome);
        System.out.println(set);
        set.add(9);
        set.add(10);
        System.out.println("\nthere are " + set.size() + "elements in the set.");
        System.out.println(set);
        
        set.remove(10);
        System.out.println("\nthere are " + set.size() + "elements in the set");
        System.out.println(set);
        System.out.println(10 + "has been removed");
        System.out.println(set);

        if (set.contains(6)) {

            System.out.println("\n" + 6 + "is part of the set.");
        } else {

            System.out.println("\n" + 6 + " is not part of the set");

        }*/

        Map<Integer, String> map = new HashMap<>();

        if (map.isEmpty()) {

            System.out.println("the map is empty");

            map.put(1, "one");
            map.put(2, "two");
            map.put(3, "three");
            map.put(4, "four");
            map.put(5, "five");

            System.out.println("the size of the map is " + map.size());

            for (Map.Entry data : map.entrySet()) {
                System.out.println(data.getKey() + "------->" + data.getValue());
            }

            map.put(9, "nine");
            map.put(10, "ten");

            System.out.println("\nthe size of the map is " + map.size());

            for (Map.Entry data : map.entrySet()) {
                System.out.println(data.getKey() + "------->" + data.getValue());
            }

            String value = map.get(3);

            if (value == null) {
                System.out.println("there is no such entry");
            } else {

                System.out.println(value + "has the key " + 3 + ".");

            }

            String outcome = map.remove(9);

            if (outcome == null) {
                System.out.println("the element was not removed");
            } else {
                System.out.println("\n" + outcome + " was successfully removed");
            }

            for (Map.Entry data : map.entrySet()) {
                System.out.println(data.getKey() + "------->" + data.getValue());
            }

            map.put(10, "Ten");

            for (Map.Entry data : map.entrySet()) {
                System.out.println(data.getKey() + "------->" + data.getValue());
            }
        } else {

            System.out.println("the map is not empty");
        }

    }

}
