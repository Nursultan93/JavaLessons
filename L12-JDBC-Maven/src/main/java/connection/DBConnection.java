package connection;

import module.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/db_spring_security",
            USERNAME = "root",
            PASSWORD = "root";

    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public boolean updateUserById(Employee employee) {
        try {
            getConnection();
            preparedStatement = connection.prepareStatement("update Employee set FULL_NAME = ?, PHONE = ?, SALARY = ?, DEP_ID=? where ID = ?");
            preparedStatement.setString(1, employee.getFullName());
            preparedStatement.setString(2, employee.getPhone());
            preparedStatement.setInt(3, employee.getSalary());
            preparedStatement.setInt(4, employee.getDepId());
            preparedStatement.setInt(5, employee.getId());

            preparedStatement.executeUpdate();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }finally {
            closeConnection();
        }
    }


    public Employee findEmployeeByPhone(String phone) {
        Employee employee = new Employee();
        try {
            getConnection();

            preparedStatement = connection.prepareStatement("select * from Employee where phone = ?");
            preparedStatement.setString(1, phone);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                Integer id = resultSet.getInt("ID");
                String fullName = resultSet.getString("FULL_NAME");
                String mobilePhone = resultSet.getString("PHONE");
                Integer salary = resultSet.getInt("SALARY");
                Integer depId = resultSet.getInt("DEP_ID");

                employee.setId(id);
                employee.setFullName(fullName);
                employee.setPhone(mobilePhone);
                employee.setSalary(salary);
                employee.setDepId(depId);
            }

            return employee;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            closeConnection();
        }
    }


    public List<Employee> getAllEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        try {
            getConnection();
            preparedStatement = connection.prepareStatement("select * from Employee");
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                Integer id = resultSet.getInt("ID");
                String fullName = resultSet.getString("FULL_NAME");
                String phone = resultSet.getString("PHONE");
                Integer salary = resultSet.getInt("SALARY");
                Integer depId = resultSet.getInt("DEP_ID");

                Employee emp = new Employee();
                emp.setId(id);
                emp.setFullName(fullName);
                emp.setPhone(phone);
                emp.setSalary(salary);
                emp.setDepId(depId);


                employeeList.add(emp);
            }

            return employeeList;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            closeConnection();
        }
    }




    public Connection getConnection(){
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            connection.createStatement();

            System.out.println("Database ile connection yaradildi");

            return connection;

        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void closeConnection() {
        try {
            connection.close();
            preparedStatement.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }


}
