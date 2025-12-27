/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package box;

import Box1.Box1;
import java.util.ArrayList;

/**
 *
 * @author Wandi Mtshali
 */
public class Box {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Box1 box1 = new Box1<>();
        box1.setName(1);
        box1.setNumber(3);
        
        System.out.println(box1.getName()+""+box1.getNumber());
        
        ArrayList<Box1> bs = new ArrayList<>();
        bs.add((Box1) box1.getNumber());
        bs.add((Box1) box1.getName());
        
        
        System.out.println(bs.get(1));
        

        
    }
    
}
