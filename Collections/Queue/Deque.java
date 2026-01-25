import java.util.*;
//FIFO
public class Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad=new ArrayDeque<>();
        ad.offer(1);
        ad.offer(5);
        ad.offer(3);
        ad.offer(9);
        System.out.println(ad);
        ad.poll();
        System.out.println(ad.peek());
        ad.offerFirst(1);
        ad.offerLast(9);
        ad.size();
        ad.pollLast();
        ad.pollLast();
    }    
}
