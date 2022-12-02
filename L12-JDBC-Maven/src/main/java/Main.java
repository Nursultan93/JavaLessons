import connection.DBConnection;
import module.Employee;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        DBConnection db = new DBConnection();


        Employee employee = new Employee(2, "Terlan Abbasov", "+994509876543", 3000, 1);

        boolean isUpdated =  db.updateUserById(employee);

        if (isUpdated == true){
            System.out.println("Employee ubdate olundu");
        }


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
