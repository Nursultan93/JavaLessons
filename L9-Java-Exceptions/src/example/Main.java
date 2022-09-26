package example;

import example.exception.EmployeeNotFound;
import example.exception.UsernamePasswordNotEmpty;

import java.util.List;
import java.util.Objects;

public class Main {

    public static String username = "user";
    private static String password = "123";

    public static void main(String[] args) {
        DBConnection dbConnection = new DBConnection();
        List<Employees> list = dbConnection.getEmployees();

        if (list.isEmpty())
            throw new EmployeeNotFound("Databasede userler yoxdu");

        for (Employees e : list){
            if (e.getName() == null){
                throw new RuntimeException("Name bos ola bilmez");
            }

            System.out.println(e);
        }
    }
}
