package example;

import exception.Employee;

import java.util.ArrayList;
import java.util.List;

public class DBConnection {

    public DBConnection getConnection(){
        System.out.println("Database ile elaqe yaradildi");
        return new DBConnection();
    }


    public List<Employees> getEmployees(){
        getConnection();

        List<Employees> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++){
            Employees employees = new Employees();
            //employees.setName("Name "+i);
            employees.setSurname("Surname "+i);
            employees.setAge(i+20);

            list.add(employees);
        }

        return list;
    }
}
