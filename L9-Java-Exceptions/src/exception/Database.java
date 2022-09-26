package exception;

import exception.custom.EmployeeNotFoundException;

import java.sql.SQLException;

public class Database {

    public static Employee getEmployeeFromDatabase()  {
        return null;
    }

    public void openDbConnection(){
        System.out.println("Open Connection");
    }

    public void closeDbConnection(){

        System.out.println("Close connection");
    }
}
