/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Wandi Mtshali
 */
public class BankApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Queue<String> strings = new LinkedList<>();
        strings.add("Alice");
        strings.add("Bob");
        strings.add("Charlie");
        strings.add("Diana");
        strings.add("Eve");

        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 5);
        map.put("Bob", 3);
        map.put("Charlie", 4);
        map.put("Diana", 6);
        map.put("Eve", 2);

        System.out.println(" Queue " + strings);
        System.out.println(" Map " + map);

       List<String> servedCustomers = new ArrayList<>();
       
        for (int i = 0; i < strings.size(); i++) {
            String removed = strings.poll();
            servedCustomers.add(removed);
            System.out.println(" customer :"+ removed+" time "+map.get(removed));
        }

        Stack<String> vipCustomers = new Stack();
        vipCustomers.push("Frank");
        vipCustomers.push("Grace");
        
        for (int i = 0; i < vipCustomers.size(); i++) {
            String popped = vipCustomers.pop();
            strings.add(popped);
            
        }
        System.out.println(" queue :"+strings);
        System.out.println(" list  "+servedCustomers);
       

        /*List<String> servedCustomers = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            String customer = strings.poll();
            if (customer != null) {
                servedCustomers.add(customer);
                System.out.println("Serving " + customer + " (Service time: " + serviceTimes.get(customer) + " minutes)");
            }
        }

        Stack<String> vipStack = new Stack<>();
        vipStack.push("Frank");
        vipStack.push("Grace");

        while (!vipStack.isEmpty()) {
            String vip = vipStack.pop();
            strings.add(vip);
        }

        System.out.println("\nFinal Queue: " + strings);
        System.out.println("Served Customers: " + servedCustomers);
         */
    }

}
