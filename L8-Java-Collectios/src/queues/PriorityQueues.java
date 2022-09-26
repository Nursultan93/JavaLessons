package queues;

import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Amit");
        pq.add("Vijay");
        pq.add("Karan");
        pq.add("Jai");
        pq.add("Rahul");

        //System.out.println(pq.element());
        //System.out.println(pq.peek());
        //pq.remove("Jai");
        System.out.println(pq.poll());

        pq.forEach(v -> System.out.println(v));

    }
}
