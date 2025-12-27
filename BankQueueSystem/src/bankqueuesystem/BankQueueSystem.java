/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankqueuesystem;

/**
 *
 * @author Wandi Mtshali
 */import java.util.*;

public class BankQueueSystem {
    public static void main(String[] args) {
        // 1. Declare and initialize a Queue to store customer names
        Queue<String> queue = new LinkedList<>();

        // 2. Add customers to the queue
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        queue.add("Diana");
        queue.add("Eve");

        // 3. Declare and initialize a Map<String, Integer> for service times
        Map<String, Integer> serviceTimes = new HashMap<>();
        serviceTimes.put("Alice", 5);
        serviceTimes.put("Bob", 3);
        serviceTimes.put("Charlie", 4);
        serviceTimes.put("Diana", 6);
        serviceTimes.put("Eve", 2);

        // 4. Print the current queue and map
        System.out.println("Current Queue: " + queue);
        System.out.println("Service Times: " + serviceTimes);

        // 5. Serve the first two customers and store them in servedCustomers
        List<String> servedCustomers = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            String customer = queue.poll(); // remove from queue
            if (customer != null) {
                servedCustomers.add(customer);
                System.out.println("Serving " + customer + " (Service time: " + serviceTimes.get(customer) + " minutes)");
            }
        }

        // 6. Declare and initialize a Stack<String> for VIP customers
        Stack<String> vipStack = new Stack<>();
        vipStack.push("Frank");
        vipStack.push("Grace");

        // 7. Pop all VIP customers from the stack and add them to the queue
        while (!vipStack.isEmpty()) {
            String vip = vipStack.pop();
            queue.add(vip);
        }

        // 8. Print the final state of the queue and served customers
        System.out.println("\nFinal Queue: " + queue);
        System.out.println("Served Customers: " + servedCustomers);
    }
}
