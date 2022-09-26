package sets;

import java.util.Set;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("D");
        treeSet.add("E");

        System.out.println("Initial Set: "+treeSet);

        System.out.println("Reverse Set: "+treeSet.descendingSet());

        System.out.println("Head Set: "+treeSet.headSet("C"));

        System.out.println("SubSet: "+treeSet.subSet("A", false, "E", true));

        System.out.println("TailSet: "+treeSet.tailSet("C", false));
    }
}
