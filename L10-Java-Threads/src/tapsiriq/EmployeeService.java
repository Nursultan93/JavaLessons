package tapsiriq;

import java.util.HashMap;
import java.util.Map;

public class EmployeeService {

    Map<Integer, Employee> employees = new HashMap<>();

    public void printEmployee(){
        for (Employee employee : employees.values()){
            System.out.println(employee);
        }
    }

    public void addEmployee(Employee employee){
        employees.put(employee.getId(), employee);
    }

    public void updateEmploye(int id, Employee employee){
        employees.put(id, employee);
    }

    public void deleteEmployee(int id){
        employees.remove(id);
    }
}
