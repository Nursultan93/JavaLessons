package exception;


public class Foo {

    public static void aMethod() throws Exception{
        try {
            throw new Exception();
        }finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {

        try {
            aMethod();
        }catch (Exception e){
            System.out.println("Exp");
        }
        System.out.println("Finished");
    }
}
