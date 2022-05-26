public class Massivler {

    static String[] seherler = new String[5];

    public void seherElaveEt(String[] seherAd) {
        seherler = seherAd;
    }

    public static void main(String[] args) {
        String[] yeniSeherler = new String[5];
        yeniSeherler[4] = "Baki";
        yeniSeherler[0] = "Lenkeran";
        yeniSeherler[3] = "Samaxi";
        yeniSeherler[2] = "Susa";
        yeniSeherler[1] = "Sumqayit";

        Massivler m = new Massivler();
        m.seherElaveEt(yeniSeherler);

        for (int i=0; i< seherler.length; i++){
            System.out.println(seherler[i]);
        }

    }



    static  int count = 0;
    int sayi = 9;

    public static void print() {
       count = count+1;
    }

    public void cap() {
        count = count + 1;
        sayi = sayi + 1;
    }
}
