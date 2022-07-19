package inheritance_exm.interfaces_emx;

public class Toyuq extends Quslar implements EvQuslari{

    public boolean ucaBilirmi = true;
    public boolean yirtici = false;
    public String adi = "Toyuq A";

    @Override
    public void yemAxtar() {
        System.out.println("Toyuq yem axtarir");
    }


    @Override
    public void evQusuGezir() {
        System.out.println("Toyuq Gezir");
    }
}
