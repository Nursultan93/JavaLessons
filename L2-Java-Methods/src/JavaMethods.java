package src;

public class JavaMethods {

    public void toplamaEmeli(int birinciToplanan, int ikinciToplanan) { // 4, 7
        int c = birinciToplanan + ikinciToplanan;
        System.out.println(c);
    }

    public int cixmaEmeli(int birinciEded, int ikiciEded) { // 5, 2
        int c = birinciEded - ikiciEded;
        return c;
    }

    public static void vurmaEmeli(int birinci, int ikinci) {
        int c = birinci * ikinci;
        System.out.println(c);
    }

    public static int bolmeEmeli(int birinci, int ikinci) {
        int c = birinci % ikinci;
        return c;
    }


    public static void main(String[] args) {
        JavaMethods jm = new JavaMethods();

        jm.toplamaEmeli(4, 7);

        int b =  jm.cixmaEmeli(5, 2);

        System.out.println(b);


        jm.vurmaEmeli(3, 7);

        int d = JavaMethods.bolmeEmeli(9, 4);

        System.out.println(d);
    }

}
