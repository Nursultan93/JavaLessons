package inheritance_exm.interfaces_emx;

public class Devequsu extends Quslar{

    public boolean ucaBilirmi = false;
    public boolean yirtici = true;
    public String adi = "Avstri";

    @Override
    public void yemAxtar() {
        System.out.println("Devequsu yem axtarir");
    }
}
