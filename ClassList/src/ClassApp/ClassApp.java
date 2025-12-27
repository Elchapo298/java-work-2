/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassApp;

import classlist.ClassList;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Wandi Mtshali
 */
public class ClassApp {

    public static void main(String[] args) throws SQLException {
        Scanner scan = new Scanner(System.in);

        ClassList list = new ClassList();
        list.createConnection();

        System.out.println("options ;add new student 1 or get all student 2 or update student = 3 or 0");
        int options = scan.nextInt();
        while (options != 0) {

            if (options == 1) {
                System.out.println("enter ID");
                int id = scan.nextInt();

                System.out.println("enter name");
                String name = scan.next();

                System.out.println("enter surname");
                String surname = scan.next();

                System.out.println("enter student number");
                int student_number = scan.nextInt();

                list.addStudent(id, name, surname, student_number);

            } else if (options == 2) {

                String output = list.getClassList();

                System.out.println(output);

            } else if (options == 3) {

                System.out.println("enter ID to update ");
                int id = scan.nextInt();

                System.out.println("enter new name");
                String name = scan.next();

                System.out.println("enter new surname");
                String surname = scan.next();

                System.out.println("enter new student number");
                int student_number = scan.nextInt();

                list.update(options, name, surname, options);

                System.out.println("list updated ");

            }
            System.out.println("options ;add new student 1 or get all student 2 or update student = 3 or 0");
             options = scan.nextInt();
        }
    }
}
