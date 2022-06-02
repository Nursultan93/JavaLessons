package scops;

public class Scops {

    int c = 0;

    static int a = 8;


    public static void main(String[] args) {
        System.out.println(a);
    }


    public int toplama(){
        int b = 3;

        Scops s = new Scops();

        s.c = 9;

        a = 9;

        return a + b;
    }


}
