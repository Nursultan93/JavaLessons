package src;

public class JavaEquals{

    public static void main(String[] args) {

        JavaEquals je1 = new JavaEquals();
        JavaEquals je2 = new JavaEquals();

        System.out.println(je1.hashCode());
        System.out.println(je2.hashCode());

    }
}
