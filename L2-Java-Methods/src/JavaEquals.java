package src;

public class JavaEquals{

    public String name = "Adil";
    public static String name2 = "Lacin";



    public static void staticMethod(){
        System.out.println("It is a static method");
    }

    public void nonStaticMethod(){
        System.out.println("Non static method");
    }



    public static void main(String[] args) {

        JavaEquals je1 = new JavaEquals();
        JavaEquals je2 = new JavaEquals();

        System.out.println(je1.hashCode());
        System.out.println(je2.hashCode());




    }
}
