package statements;

import neqliyat.Car;

public class Statements {
    public static void main(String[] args) {
        Car[] cars = new Car[]{
                new Car("BMW", 2000, "While", false),
                new Car("Audi", 2005, "Red", true),
                new Car("Opel", 1999, "Black", false)
        };


        int[] array = new int[]{1,3,5,2,7};


//        for (int param : array){
//            System.out.println(param);
//        }

//        for (int i=0; i<array.length; i++){
//            System.out.println(array[i]);
//        }


//        Car c = new Car("BMW", 2000, "While", false);
//        c.getModel();

//        for (Car c : cars ) { //int i=0; i<cars.length; i++
//            System.out.println(c.getModel());
//        }



//        for (int i=0; i<cars.length; i++){
//            System.out.println(cars[i].getModel());
//        }

        //cars[0] = BMW
        //cars[1] = Audi
        //cars[2] = Opel




        //foreach for(Car c : cars)
//        for (Car c: cars){
//            System.out.println("Model: "+c.getModel());
//            System.out.println("Year: "+c.getYear());
//            System.out.println("Color: "+c.getColor());
//            System.out.println("Is sedan: "+c.isSedan());
//            System.out.println("=====================");
//        }

        //for for(int i=0; i<5; i++)
//        for (int i=0; i<cars.length; i++){
//            System.out.println("Model: "+cars[i].getModel());
//            System.out.println("Year: "+cars[i].getYear());
//            System.out.println("Color: "+cars[i].getColor());
//            System.out.println("Is sedan: "+cars[i].isSedan());
//            System.out.println("=====================");
//        }

        //while -> while(condition)
//        int i = 3;
//        while (i<cars.length){
//            System.out.println("Model: "+cars[i].getModel());
//            System.out.println("Year: "+cars[i].getYear());
//            System.out.println("Color: "+cars[i].getColor());
//            System.out.println("Is sedan: "+cars[i].isSedan());
//            System.out.println("=====================");
//            i++;
//        }

        //do while -> do{}while(condition)
//        int j = 0;
//        do{
//            System.out.println("Model: "+cars[j].getModel());
//            System.out.println("Year: "+cars[j].getYear());
//            System.out.println("Color: "+cars[j].getColor());
//            System.out.println("Is sedan: "+cars[j].isSedan());
//            System.out.println("=====================");
//            j++;
//        }while (j<cars.length);








    }
}
