package lists;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        Vector<String> vectors = new Vector<>();
        vectors.add("BMW");
        vectors.add("Opel");
        vectors.add("Audi");
        vectors.add("Ford");
        vectors.add("Hundai");
        vectors.add("Honda");
        vectors.add("Sevralet");
        vectors.add("Mersedes");
        vectors.add("Lada");
        vectors.add("Hummer");
        vectors.add("Jeep");

        //vectors.addElement("Kia");

        //int a = vectors.capacity();

        //String arr [] = new String[11];

        //vectors.copyInto(arr);

        Collections.sort(vectors);

        //System.out.println(arr);

        System.out.println("=====");


        for (String s : vectors){
            System.out.println(s);
        }
    }
}
