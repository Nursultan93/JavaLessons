package lists;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {

        List<String> adlar = new ArrayList<>();
        adlar.add("Elcin");
        adlar.add("Nurlan");
        adlar.add("Ayten");
        adlar.add("Nazim");
        adlar.add("Salman");
        adlar.add("Elcin");

//       for(String ad : adlar){
//           System.out.println(ad);
//       }


        List<String> adlar2 = new ArrayList<>();
        adlar2.add("Samire");
        adlar2.add("Emil");
        adlar2.add("Hesen");

        adlar.addAll(adlar2);

//        for(String ad : adlar){
//            System.out.println(ad);
//        }

//        adlar.clear();
//
//        for(String ad : adlar){
//            System.out.println(ad);
//        }


        //System.out.println(adlar.contains("Adil"));

        System.out.println("------------");

//        adlar.remove("Samire");
//        adlar.remove("Emil");

        //adlar.removeAll(adlar2);

        System.out.println(adlar.indexOf("Nazim"));

        for (String ad : adlar){
            System.out.println(ad);
        }





//        List<Integer> reqemler = List.of(1, 2, 5, 6, 3, 7, 2);

//        List<Integer> reqemler = new ArrayList<>();
//
//        reqemler.add(4);
//        reqemler.add(2);
//        reqemler.add(5);
//        reqemler.add(0);
//        reqemler.add(1);
//
//        for (int i = 0; i < reqemler.size(); i++) {
//            System.out.println(reqemler.get(i));
//        }
//
//
//        reqemler.add(7);
//        reqemler.add(2);
//        System.out.println("=========");
//
//        for (int i = 0; i < reqemler.size(); i++) {
//            System.out.println(reqemler.get(i));
//        }
    }
}
