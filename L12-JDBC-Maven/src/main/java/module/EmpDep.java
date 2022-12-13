package module;

public class EmpDep {
    private String fullName;
    private String phone;
    private Integer salary;
    private String depName;

    public EmpDep() {
    }

    public EmpDep(String fullName, String phone, Integer salary, String depName) {
        this.fullName = fullName;
        this.phone = phone;
        this.salary = salary;
        this.depName = depName;
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

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    @Override
    public String toString() {
        return "EmpDep{" +
                "fullName='" + fullName + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", depName='" + depName + '\'' +
                '}';
    }
}
