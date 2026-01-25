import java.util.*;
//min heap
public class PriorityQueueS {
    public static void main(String[] args) {
        //Store elements
        //and it gives smallest element when peek 
        //it stores in tree structure datasture ro store
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.offer(3);
        pq.offer(9);
        pq.offer(1);
        pq.offer(0);
        // System.out.println(pq);
        // pq.poll();
        // System.out.println(pq.peek());
        // pq.poll();
        // System.out.println(pq.peek());
        while (pq.isEmpty()==false) {
            System.out.println(pq.peek());
            pq.poll();
        }
    }
}
