package inheritance_exm.interfaces_emx;

public class Qartal extends Quslar implements ColQuslari{

        public boolean ucaBilirmi = true;
        public boolean yirtici = true;
        public String adi = "Goyler Krali";

        @Override
        public void yemAxtar() {
                System.out.println("Qartal yem axtarir");
        }

        @Override
        public void colQusuUcur() {
                System.out.println("Qartal Ucur");
        }
}
