package inheritance_exm.interfaces_emx;

public class Qaz extends Quslar implements EvQuslari, ColQuslari{
    @Override
    public void yemAxtar() {
        System.out.println("Qaz yem axtarir");
    }


    @Override
    public void evQusuGezir() {
        System.out.println("Qaz gezir");
    }

}
