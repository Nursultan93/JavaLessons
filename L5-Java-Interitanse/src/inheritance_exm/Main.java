package inheritance_exm;

import inheritance_exm.abstracts.Mac;

public class Main {
    public static void main(String[] args) {

        Mac mac = new Mac();
        mac.ekranOlcusu = "15X19";
        mac.modeli = "Mac Pro Max";

        System.out.println(mac.ekranOlcusu);
        System.out.println(mac.modeli);

        mac.iseSal();
    }
}
