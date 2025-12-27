/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cars_List;

import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Wandi Mtshali
 */
public class carsDB implements DAO<Cars_List> {

    private Connection connection;

    public carsDB(String DBURL) throws SQLException {

        connection = DriverManager.getConnection(DBURL);

    }

    @Override

    public Cars_List get(Integer code) {

        String sql = "SELECT ID, MAKE, MODEL, PIRCE, SOLD " + "FROM CARS " + "WHERE ID =?";

        try {

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, code);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Integer ID = rs.getInt("ID");
                String make = rs.getString("make");
                String model = rs.getString("model");
                Integer price = rs.getInt("PIRCE");
                boolean sold = rs.getBoolean("sold");

                Cars_List cars_List = new Cars_List(ID, make, model, price, sold);
                rs.close();

                return cars_List;

            } else {
                rs.close();
                return null;

            }

        } catch (SQLException ex) {

            System.err.print(ex);
            return null;
        }

    }

    @Override
    public List<Cars_List> getAll() {
        String sql = "SELECT * FROM CARS " + "ORDER BY ID ASC";

        List<Cars_List> cars_Lists = new ArrayList<>();

        try {

            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Integer ID = rs.getInt("ID");
                String make = rs.getString("make");
                String model = rs.getString("model");
                Integer price = rs.getInt("pirce");
                boolean sold = rs.getBoolean("sold");

                Cars_List cars_List = new Cars_List(ID, make, model, price, sold);

                cars_Lists.add(cars_List);

            }
            return cars_Lists;

        } catch (SQLException ex) {
            System.err.print(ex);
            return null;

        }

    }

    @Override
    public boolean add(Cars_List t) {

        String sql = "INSERT INTO CARS (ID, MAKE, MODEL, PIRCE, SOLD)" + "VALUES (?,?,?,?,?)";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, t.getID());
            ps.setString(2, t.getMake());
            ps.setString(3, t.getModel());
            ps.setInt(4, t.getPrice());
            ps.setBoolean(5, t.isSold());

            ps.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.print(ex);
            return true;

        }

    }

    @Override
    public boolean update(Cars_List t) {

        String sql = "UPDATE CARS SET "
                + " MAKE =?, "
                + "MODEL =? "
                + "PIRCE =? "
                + "SOLD =? "
                + "WHERE ID =?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(2, t.getMake());
            ps.setString(3, t.getModel());
            ps.setInt(4, t.getPrice());
            ps.setBoolean(5, t.isSold());
            ps.executeUpdate();
            return false;

        } catch (SQLException ex) {
            System.err.println(ex);
            return false;
        }

    }

    @Override
    public boolean delete(Cars_List t) {
        String sql = "DELETE FROM CARS " + "WHERE ID =?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, t.getID());
            ps.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.err.print(ex);
            return false;

        }

    }

    public Cars_List mostExpensivCar() throws SQLException {

        String sql = "SELECT * FROM CARS ";
        int highest = 0;
        Cars_List cars_List = null;

        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            int price = rs.getInt("Pirce");
            
            if (price > highest ) {

                highest = price;
                Integer ID = rs.getInt("ID");
                String make = rs.getString("make");
                String model = rs.getString("model");
                Integer price1 = rs.getInt("pirce");
                boolean sold = rs.getBoolean("sold");

                cars_List = new Cars_List(ID, make, model, price1, sold);

            }

        }
        return cars_List;
    }

}
