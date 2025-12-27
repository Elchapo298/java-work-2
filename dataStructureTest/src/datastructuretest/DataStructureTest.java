/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datastructuretest;

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
public class DataStructureTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Queue<String> queue = new LinkedList<>();

        queue.add("Naledi");
        queue.add("Thabo");
        queue.add("Aisha");
        queue.add("Lerato");
        queue.add("Miguel");

        Map<String, Integer> map = new HashMap<>();

        map.put("Naledi", 7);
        map.put("Thabo", 5);
        map.put("Aisha", 6);
        map.put("Lerato", 8);
        map.put("Miguel", 4);

        System.out.println("QUEUE " + queue);
        System.out.println("MAP" + map);

        List<String> servedPatients = new LinkedList<>();

        for (int i = 1; i <= 2; i++) {

            String removed = queue.poll();
            servedPatients.add(removed);

        }
        Stack<String> emergencyStack = new Stack<>();
        emergencyStack.add("Kabelo");
        emergencyStack.push("Zinhle");
        System.out.println("Emergence: " + emergencyStack);

        while (!emergencyStack.isEmpty()) {

            String removed = emergencyStack.pop();
            queue.add(removed);
        }

        System.out.println("QUEUE :" + queue);
        System.out.println("ServedPatients :" + servedPatients);
    }

}
