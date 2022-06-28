package repeat_oop.interfaces;

public interface Quslar {

    int age = 10; //public static

    String getName();

    int getAge();

    static void metod1(){
        System.out.println("methid1");
    }

    default void method2(){
        System.out.println("methid2");
    }
}
