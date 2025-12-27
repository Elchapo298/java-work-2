/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB_Manager;

import java.sql.*;

/**
 *
 * @author Wandi Mtshali
 */
public class DB_Manager {

    private Connection connection;

    public void createConnection() throws SQLException {

        connection = DriverManager.getConnection("jdbc:derby://localhost:1527/MYDATABASE");

    }

    public void addCourse(int ID, String course_name, int modules) throws SQLException {

        String sql = "INSERT INTO COURSE (ID ,COURSENAME, MODULES )" + " VALUES (?,?,?)";

        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setInt(1, ID);
        ps.setString(2, course_name);
        ps.setInt(3, modules);

        // Statement statement = connection.createStatement();
        ps.executeUpdate();
        ps.close();

    }

    public String get() {

        String sql = "SELECT * FROM  COURSE " + "ORDER BY ID ASC";
        String output = "ID |  COURSENAME | MODULES\n";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Integer ID = rs.getInt("ID");
                String course_name = rs.getString("COURSENAME");
                int module = rs.getInt("MODULES");

                output += " " + ID + " ," + course_name + " ," + module + "\n";

            }

        } catch (SQLException ex) {
            System.out.println(" Error" + ex.getMessage());
        }
        return output;
    }

    public String update(int ID, String course_name, int MODULES) {

       // String sql = "UPDATE COURSE SET " + " ID = ?," + "COURSENAME = ?" + "MODULES = ?";
        String sql = "UPDATE COURSE SET COURSENAME = ?, MODULES = ? WHERE ID = ?";

        String message = "";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
           
            preparedStatement.setString(1, course_name);
            preparedStatement.setInt(2, MODULES);
            preparedStatement.setInt(3, ID);
            preparedStatement.executeUpdate();
            preparedStatement.close();

            message = get();
            
            
        } catch (SQLException ex) {
            message = " error " + ex.getMessage();
        }

        return message;
    }

}
