package src;

public class OverloadsMethods {


    public void capEt() {
        System.out.println("Salam men cap et metodundan gelirem");
    }

    public void capEt(String name) {
        System.out.println(name + " sene salam deyir");
    }

    public void capEt(Integer yas) {
        System.out.println("yasi "+yas+" yuxari olanlar giremez!");
    }

    public String capEt(String name, Integer yas) {
        return "salam";
    }


    public static void main(String[] args) {
        OverloadsMethods om = new OverloadsMethods();

        om.capEt();

        om.capEt("Elcin");

        om.capEt(60);

        String str = om.capEt("Elcin", 23);

        System.out.println(str);


    }

}
