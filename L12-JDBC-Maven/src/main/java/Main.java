import connection.DBConnection;
import connection.DbHrConnection;
import module.EmpDep;
import module.Employee;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        DbHrConnection dbHrConnection = new DbHrConnection();

        List<EmpDep> empDepList =  dbHrConnection.getEmployeeByDepId(3);

        System.out.println(empDepList);


//        DBConnection db = new DBConnection();
//
//
//        Employee employee = new Employee(2, "Terlan Abbasov", "+994509876543", 3000, 1);
//
//        boolean isUpdated =  db.updateUserById(employee);
//
//        if (isUpdated == true){
//            System.out.println("Employee ubdate olundu");
//        }


//        Employee employee = db.findEmployeeByPhone("+944328474247");
//
//        System.out.println(employee);

//        List<Employee> iscilerim =  db.getAllEmployee();
//
//        for (Employee emp : iscilerim){
//            System.out.println(emp);
//        }
    }
}
