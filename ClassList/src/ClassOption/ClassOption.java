/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassOption;

import java.util.List;

/**
 *
 * @author Wandi Mtshali
 */
public interface ClassOption<T> {
    
    
    List<T> getAll();

    boolean add(T t);
    
    
}
