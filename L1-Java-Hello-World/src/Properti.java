public class Properti {
    public static String version = "v1";
    public static String url = "http://facebook.com";
    public static String parol = "1234";

    static int count = 1;

    public Properti() {
        count++; // count = count + 1
    }

    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            Properti p = new Properti();
        }
        System.out.println(count);
    }

}
