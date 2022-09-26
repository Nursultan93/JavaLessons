package sets;

import java.util.LinkedHashSet;

public class LinkedHashSets {
    public static void main(String[] args) {
        LinkedHashSet<String> numbers = new LinkedHashSet<>();
        numbers.add("BMW");
        numbers.add("Audi");
        numbers.add("Opel");





        for (String i : numbers){
            System.out.println(i);
        }
    }
}
