package module;

public class Employee {
    private Integer id;
    private String fullName;
    private String phone;
    private Integer salary;
    private Integer depId;

    public Employee() {
    }

    public Employee(Integer id, String fullName, String phone, Integer salary, Integer depId) {
        this.id = id;
        this.fullName = fullName;
        this.phone = phone;
        this.salary = salary;
        this.depId = depId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", phone='" + phone + '\'' +
                ", salary='" + salary + '\'' +
                ", depId=" + depId +
                '}';
    }
}
