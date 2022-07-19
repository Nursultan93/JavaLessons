package variables;

public class ExmVariable {

    public static void main(String[] args) {
        ExmMetods em = new ExmMetods();

        int netice = em.topla(3, 5);

        int cixmaNetice = ExmMetods.cixma(6, 4);

        //int topla2 = em.topla2();

        em.toplaVeCapEt(4, 6);

        System.out.println(em.topla2());
    }
}
