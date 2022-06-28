package src.varables;

import src.methods.MethodsExample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int [] myArray = new int[sc.nextInt()];

        for (int i=0; i<myArray.length; i++){
            myArray[i] = sc.nextInt();
        }


        MethodsExample me = new MethodsExample();
        int vauleMax =  me.getMaxElementInArray(myArray);
        int vauleMin = me.getMinElementInArray(myArray);

        System.out.println(vauleMax);
        System.out.println(vauleMin);



//        Car car = new Car();
//        car.setModel("BMW");
//        car.setOturacaqSayi(2);
//        car.setMatorGucu(3.5);
//        car.setQapiSayi(2);
//
//        System.out.println(car.getModel());
//        System.out.println(car.getOturacaqSayi());
//        System.out.println(car.getMatorGucu());
//        System.out.println(car.getQapiSayi());
    }
}
