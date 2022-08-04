package src;

public class Main {

    public static void main(String[] args) {
        JavaEquals.staticMethod();

        JavaEquals je = new JavaEquals();
        je.nonStaticMethod();


        System.out.println(JavaEquals.name2);
        System.out.println(je.name);
    }


}
