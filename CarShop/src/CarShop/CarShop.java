/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarShop;

import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Wandi Mtshali
 */
public class CarShop {

    public static void main(String[] args)  {

        Connection con = null;
        Statement state =null;

        ResultSet rs = null;
        Scanner scan = new Scanner(System.in);

        try {
            String sql = "SELECT * FROM CARS";
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/CarShop");
            state = con.createStatement();
            rs = state.executeQuery(sql);

            boolean running = true;

            while (running) {

                System.out.println("Menu");
                System.out.println("1 CHECK STOCK");
                System.out.println("2 EXIT:");
                System.out.println("choose an option: ");
                int choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        checkStockByYear(rs);
                        break;
                    case 2:
                        running = false;
                        System.out.println("Exiting....");
                        break;
                    default:
                        System.out.println("Invalid option. please choose a valid option.");
                        break;
                }
                System.out.println();

            }

        } catch (SQLException ex) {

            ex.printStackTrace();

        } finally {
            if (rs != null) {
                rs.close();
            }
            if (state != null) {
                state.close();
            }
            if (con != null) {
                con.close();
            }

            state.close();
            con.close();

        }
        scan.close();

    }

    public static void checkStockByYear(ResultSet rs) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter ther year of the car you are looking for: ");
        int carYear = scan.nextInt();
        int cars = 0;

        try {
            while (rs.next()) {
                int yearTable = rs.getInt("manufacture_year");

                if (yearTable == carYear) {
                    cars++;
                    //make, model, manufacture_year, price 

                    int ID = rs.getInt("ID");
                    String make = rs.getString("MAKE");
                    int manufacture = rs.getInt("MANUFACTURE_YEAR");
                    double price = rs.getInt("PRICE");

                    System.out.println(ID + " " + make + " " + manufacture + " " + price);
                }

            }
            System.out.println("TOTAL CARS :" + cars);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
