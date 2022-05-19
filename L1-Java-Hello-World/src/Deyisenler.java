
public class Deyisenler {
    //String
    //int
    //boolean
    //double
    //float
    //char

    //JVM - JAVA Virtual Masin

    public static void main(String[] args) {
        String adSoyad = "Emil Allahverdiyev. 27 yasi var!"; //simvollar yigini
        int yas = 130; //tam ededleri   -2,147,483,648 to 2,147,483,647
        double maasi = 2500.34; // kesr ededleri
        float ikinciMaasi = 190.23f; //kesr ededleri
        boolean booleanDeyer = true; // true & false
        char simvol = 's'; // simvol saxlamaq ucun
        byte byteDeyer = 126; // -128 & 127
        short shortDeyer = 3224; // -32,768 & 32,767
        long deyer = 234;// -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        int c = byteDeyer;

        byte d = (byte) yas;

        //int -> Integer
        //double -> Double
        //float -> Float

        Integer yas2 = 25;
        Double maas2 = 34.7;



        System.out.println(d);


        long l1 = 9223372036854775807L;

        int i1 = (int) l1;

        System.out.println("i1= "+i1);


        int i2 = 2147483647;

        long l2 = i2;

        System.out.println("l2="+l2);

    }
}
