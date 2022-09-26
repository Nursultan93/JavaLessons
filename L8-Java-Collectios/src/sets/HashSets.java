package sets;

import java.util.HashSet;
import java.util.Set;

public class HashSets {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("BMW");
        hashSet.add("Audi");
        hashSet.add("Opel");

        //hashSet.clear();

//        if (hashSet.contains("BMW"))
//            System.out.println("Bizim magazamizda BMW var!");

//        if (!hashSet.isEmpty())
//            System.out.println("list bos deyil");

//        var iterator = hashSet.iterator();
//        while (iterator.hasNext())
//            System.out.println(iterator.next());

        //hashSet.remove("Audi");


        for (String str : hashSet){
            System.out.println(str);
        }
    }
}
