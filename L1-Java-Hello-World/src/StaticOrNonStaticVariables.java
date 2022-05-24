public class StaticOrNonStaticVariables {


    public String name = "Elcin";
    public int yas = 23;
    public static String oxuduguMekteb = "1 sayli orta mekteb";

    public final String masinAdi = "BMW";

    public static final String DIL = "Java";

    public static void main(String[] args) {
        StaticOrNonStaticVariables s = new StaticOrNonStaticVariables();

        System.out.println(s.name);

        System.out.println(s.masinAdi);


        System.out.println(s.oxuduguMekteb);

        System.out.println(StaticOrNonStaticVariables.oxuduguMekteb);


        s.name = "Samir";

        System.out.println(s.name);

        //s.masinAdi = "Audi";

        //System.out.println(s.masinAdi);

        //StaticOrNonStaticVariables.DIL = "PHP";

        System.out.println(StaticOrNonStaticVariables.DIL);



    }
}
