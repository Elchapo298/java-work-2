/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import DB_Manager.DB_Manager;
import java.sql.SQLException;

/**
 *
 * @author Wandi Mtshali
 */
public class Database {
    
    public static void main(String[] args) throws SQLException {
        
        DB_Manager db_Manager = new DB_Manager();
        
        db_Manager.createConnection();
        
      // db_Manager.addCourse(0, "IT DIPLOMA", 22);
      // db_Manager.addCourse(1, "CS DIMPLOMA", 24);
       
       String info = db_Manager.get();
        System.out.println(info);
        String out = db_Manager.update(0, "MULTI DIPLOMA", 27);
        System.out.println(out);
    }
    
    
    
    
}
