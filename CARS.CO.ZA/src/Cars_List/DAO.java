/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cars_List;

import java.util.List;

/**
 *
 * @author Wandi Mtshali
 */
public interface DAO<T> {

    T get(Integer code);

    List<T> getAll();

    boolean add(T t);

    boolean update(T t);

    boolean delete(T t);

}
