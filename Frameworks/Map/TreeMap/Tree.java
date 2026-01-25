import java.util.*;
public class Tree {
        public static void main(String[] args) {
        //in hash map we store value un key value pair
        //does  store keys in sorted order
        //map not save duplicates 
        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.put(12,"Ranjit" );
        tm.put(2,"Savita" );
        tm.put(13,"Shankar" );
        tm.put(4,"Ravi" );     
        // System.out.println(tm);   
        // System.out.println(tm.get(3));
        // System.out.println(tm.get(7));
        System.out.println(tm.ceilingKey(3));
        System.out.println(tm.floorKey(3));
            Set<Integer>st=tm.keySet();
            System.out.println(st);
        // tm.remove(2);
        // System.out.println(tm.size());
        }
}
