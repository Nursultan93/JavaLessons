public class DeyisenlerClass {
    public String adi = "Elcin";
    public int yasi = 26;

    public int tevelludu = 1996;

    public static void main(String[] args) {
        DeyisenlerClass deyisenler = new DeyisenlerClass();

        System.out.println("Adi: "+deyisenler.adi);
        System.out.println("Yasi: "+deyisenler.yasi);


        String birinciToplanan = "2";
        String ikinciToplanan = "3";

        String netice = birinciToplanan + ikinciToplanan;// 23

        System.out.println("netice= "+netice);

        int birinci = 5;
        int ikinci = 3;

        int netice2 = birinci + ikinci; //5 + 3 = 8

        System.out.println("netice2 = "+netice2);


        double maasi = 2500.95;

        System.out.println("maasi= "+maasi);


    }
}
