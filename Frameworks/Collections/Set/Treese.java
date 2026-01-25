import java.util.*;
public class Treese {
    public static void main(String[] args) {
        //DS that store unique elements n sorted order
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(12);
        ts.add(0);
        ts.add(-1);
        ts.add(90);
        // ts.remove(12);
        ts.add(9);
        ts.add(7);
        //floor print the value lesser than<= 8
            System.out.println(ts);
        System.out.println(ts.floor(8));
        //ceiling print the calue greter than >=8
        System.out.println(ts.ceiling(8));
        ts.size();
    
    }
}
