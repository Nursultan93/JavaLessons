package inner.enums;

public class Students {
    private String name;
    private String faculty;
    private Degree degree;

    public Students(String name, String faculty, Degree degree){
        this.name = name;
        this.faculty = faculty;
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", faculty='" + faculty + '\'' +
                ", degree=" + degree +
                '}';
    }
}
