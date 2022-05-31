package statements;

import neqliyat.Car;

import java.util.Scanner;

public class Statement2 {
    public static void main(String[] args) {
        Car[] cars = new Car[]{
                new Car("BMW", 2000, "While", false),
                new Car("Audi", 2005, "Red", true),
                new Car("Opel", 1999, "Black", false)
        };

//        Scanner sc = new Scanner(System.in);
//
//        int deyer = sc.nextInt();
//
//        switch (deyer){
//            case 0:
//                System.out.println("0 gonderildi");
//                break;
//            case 1:
//                System.out.println("1 gonderildi");
//                break;
//            case 2:
//                System.out.println("2 gonderildi");
//                break;
//            default:
//                System.out.println("2 den boyuk deyer gonderildi");
//        }



        //if else
//        for (int i = 0; i < cars.length; i++) {
//            if (cars[i].isSedan()){
//                System.out.println("Bu masinin 4 qapisi var");
//            }else {
//                System.out.println("Bu masinin 2 qapisi var");
//            }

//            if (cars[i].getModel().equalsIgnoreCase("BMW")){
//                System.out.println("BMW masin suretlidi");
//            }else if (cars[i].getModel().equalsIgnoreCase("Audi")){
//                System.out.println("Audi keyfiyyetlidi");
//            }else if (cars[i].getModel().equalsIgnoreCase("opel")){
//                System.out.println("Opel serfelidi");
//            }else{
//              System.out.println("Hec biri deyil");
//            }

//            if (cars[i].getModel().equalsIgnoreCase("BMW")){
//                System.out.println("BMW masin suretlidi");
//            }
//
//            if (cars[i].getColor().equalsIgnoreCase("Red")){
//                System.out.println("Audi Qirmizidi");
//            }
//        }
    }
}
