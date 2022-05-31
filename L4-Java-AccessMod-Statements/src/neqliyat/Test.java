package neqliyat;

public class Test {

    public static void main(String[] args) {

        Car c = new Car("Opel", 1999, "Black", true);

        System.out.println(c.getModel());
        System.out.println(c.getYear());
        System.out.println(c.getColor());
        System.out.println(c.isSedan());



//        Car c = new Car();
//        c.setModel("BMW");
//        c.setSedan(false);
//
//        System.out.println(c.getModel());
//
//        if (c.isSedan()){
//            System.out.println("4 qapili masindi");
//        }
    }
}
