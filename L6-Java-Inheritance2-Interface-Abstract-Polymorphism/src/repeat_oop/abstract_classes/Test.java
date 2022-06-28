package repeat_oop.abstract_classes;

public class Test {
    public static void main(String[] args) {
        Bina[] b = new Bina[]{
                new KristalAbseron(),
                new XezerInsaat(),
                new AAInsaat()
        };

        for (Bina bina : b){
            System.out.println(bina.getMtkName());;
        }
    }
}
