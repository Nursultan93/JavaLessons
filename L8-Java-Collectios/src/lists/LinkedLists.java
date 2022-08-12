package lists;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);//0
        list.add(2);//1
        list.add(3);//2
        list.add(1);//3

        //list.addFirst(9);
        //list.addLast(7);

//        Iterator<Integer> iterator =  list.descendingIterator();
//
//        while (iterator.hasNext())
//            System.out.println(iterator.next());

//        var element =  list.element();

//        var deyer = list.get(1);

//        var deyer = list.getLast();

        //var index = list.indexOf(9);

        //list.offer(5);

        //list.offerFirst(8);

        //var deyer = list.peekLast();

//        var deyer = list.pop();
//
//        System.out.println(deyer);

        list.set(2, 90);

        System.out.println("===========");

        for (Integer i: list) {
            System.out.println(i);
        }

    }
}
