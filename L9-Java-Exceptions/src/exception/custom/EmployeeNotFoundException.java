package exception.custom;

public class EmployeeNotFoundException extends RuntimeException{

    public EmployeeNotFoundException(String massage){
        super(massage);
    }
}
