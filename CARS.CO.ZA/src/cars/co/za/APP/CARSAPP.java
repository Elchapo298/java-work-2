/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cars.co.za.APP;

import Cars_List.Cars_List;
import Cars_List.carsDB;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Wandi Mtshali
 */
public class CARSAPP {

    public static void main(String[] args) throws SQLException {

        carsDB dataBase = new carsDB("jdbc:derby://localhost:1527/CARS.CO.ZA");
        List<Cars_List> cars_List;
/*
        dataBase.add(new Cars_List(0, "BMW", "320I", 320000, true));
        dataBase.add(new Cars_List(1, "bMW", "340I", 500000, true));
        dataBase.add(new Cars_List(2, "bMW", "440I", 700000, false));
        dataBase.add(new Cars_List(3, "vw", "polo", 120000, false));
        dataBase.add(new Cars_List(4, "jeep", "rangler", 600000, true));
        dataBase.add(new Cars_List(5, "Porsche", "GT3RS", 5000000, true));
        dataBase.add(new Cars_List(6, "Porsche", "GT4RS", 2500000, false));
        dataBase.add(new Cars_List(7, "mercedese", "C200", 650000, true));
        dataBase.add(new Cars_List(8, "NISSAN", "NP200", 170000, false));
*/
        System.out.println("SELECT OPTION");
        System.out.println("GET ALL CARS-1");
        System.out.println("DELETE CAR -2");
        System.out.println("GET A CAR -3");
        System.out.println("UPDATE A CAR - 4");
        System.out.println("MOST EXPENSIVE CAR-5");

        Scanner scan = new Scanner(System.in);

        int option = scan.nextInt();

        if (option == 1) {
            cars_List = dataBase.getAll();
            System.out.println("=========================\n" + cars_List.toString());
            
            for (Cars_List cars_List1 : cars_List) {
                System.out.println(cars_List1);
                
            }

        } else if (option == 2) {
            cars_List = dataBase.getAll();
            System.out.println("=========================\n" + dataBase);
            System.out.println("  ID  ");
            int id = scan.nextInt();

            System.out.println("  make ");
            String make = scan.nextLine();

            System.out.println("  model  ");
            String model = scan.nextLine();

            System.out.println("  price  ");
            int price = scan.nextInt();

            System.out.println("  sold status T/F ");
            boolean soldStatus = scan.nextBoolean();

            Cars_List cars_List1 = new Cars_List(id, make, model, price, soldStatus);

            boolean isDeleted = dataBase.delete(cars_List1);

            cars_List = dataBase.getAll();
            System.out.println("=========================\n" + dataBase);

        }else if (option ==5) {
            
            Cars_List cars_List1 = dataBase.mostExpensivCar();
            
            System.out.println("Most expensive car");
            System.out.println(cars_List1.toString());
            
            
            
            
        }

    }
}
