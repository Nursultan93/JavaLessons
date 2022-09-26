package example.exception;

public class UsernamePasswordNotEmpty extends RuntimeException{
    public UsernamePasswordNotEmpty(String m) {
        super(m);
    }
}
