/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classlist;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Wandi Mtshali
 */
public class ClassList {

    private Connection connection;

    public void createConnection() throws SQLException {

        connection = DriverManager.getConnection("jdbc:derby://localhost:1527/ClassList");

    }

    public void addStudent(int ID, String NAME, String SURNAME, int STUDENT_NUMBER) throws SQLException {

        String sql = "INSERT INTO CLASSLISTTABLE  (ID,NAME, SURNAME,STUDENT_NUMBER ) VALUES (?,?,?,?) ";

        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, ID);
        ps.setString(2, NAME);
        ps.setString(3, SURNAME);
        ps.setInt(4, STUDENT_NUMBER);

        ps.executeUpdate();
        ps.close();

    }

    public String getClassList() {

        String sql = "SELECT * FROM CLASSLISTTABLE ORDER BY ID ASC ";
        String output = "ID | NAME | SURNAME | STUDENT_NUMBER \n";

        PreparedStatement ps;
        try {

            ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                int id = rs.getInt("ID");
                String name = rs.getString("NAME");
                String surname = rs.getString("SURNAME");
                int student_number = rs.getInt("STUDENT_NUMBER");

                output += "   " + id + "  " + name + "   " + surname + "  " + student_number + " \n";

            }

        } catch (SQLException ex) {

            ex.printStackTrace();
        }

        return output;
    }

    public void update(int id, String name, String surname, int student_number) {

        String sql = " UPDATE CLASSLISTTABLE  NAME = ?,SURNAME= ?,STUDENT_NUMBER= ? WHERE ID=?  ";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(0, id);
            ps.setString(1, name);
            ps.setString(2, surname);
            ps.setInt(3, student_number);

            ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

}
