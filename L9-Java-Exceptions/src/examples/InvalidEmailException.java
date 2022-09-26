package examples;

public class InvalidEmailException extends RuntimeException{
    public InvalidEmailException(String massege){
        super(massege);
    }
}
