package sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sets {


    static {
        System.out.println("Sets loaded");
    }

    public static void main(String[] args) {
        Set<String> adlar = new HashSet<>();

        adlar.add("Elcin");

        Set<String> adlar2 = Set.of("Adil", "Celal", "Feride");

        adlar.addAll(adlar2);

        adlar.add("Sadiq");

        adlar.add("Elcin");

//        for (String ad : adlar){
//            System.out.println(ad);
//        }
    }
}
