package src;

public class Employee {
    private String name;
    private double salary;
    private String department;
    private int age;
    private char gender;

    public Employee(String name, double salary, String department, int age, char gender) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString(){
        return "Employee = {" +
                "name= " +name +
                " salary= " + salary +
                " department= " + department +
                " age= "+age+
                " gender= "+gender+"}";
    }
}
