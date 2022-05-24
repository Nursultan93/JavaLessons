package src;

public class MethodsExm {

    public void adSoyadCapEt() {

        String tamAd = getAd() +" "+ getSoyad();

        System.out.println(tamAd);

        toplama();

    }

    public String getAd() {
        return "Elcin";
    }

    String a = "asadd";

    public String getSoyad() {
        return "Orceliyev";
    }

    public void toplama(){
        System.out.println(7+9);
    }

    public static void main(String[] args) {
        MethodsExm me = new MethodsExm();

        me.adSoyadCapEt();
    }
}
