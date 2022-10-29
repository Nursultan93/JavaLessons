import java.sql.SQLOutput;

public class Example extends Thread{
    @Override
    public void run() {
        System.out.println("Men Threadin run metodundan gelirem ve menim adim "+ this.getName());
    }

    public static void main(String[] args) {
        Example e = new Example();
        e.start();
    }
}
