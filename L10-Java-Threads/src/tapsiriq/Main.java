package tapsiriq;

public class Main {
    public static void main(String[] args) {

        EmployeeService employeeService = new EmployeeService();

        System.out.println("================ Add Employee ================");

        Employee elcin = new Employee(1, "Elcin", 25);
        Employee nurlan = new Employee(2, "Nurlan", 24);
        Employee seid = new Employee(3, "Seid", 30);

        employeeService.addEmployee(elcin);
        employeeService.addEmployee(nurlan);
        employeeService.addEmployee(seid);
        employeeService.printEmployee();


        System.out.println("================ Update Employee ================");


        Employee seid2 = new Employee(3, "Seid", 28);
        employeeService.updateEmploye(3, seid2);
        employeeService.printEmployee();

        System.out.println("================ Delete Employee ================");

        employeeService.deleteEmployee(2);
        employeeService.printEmployee();
    }
}
