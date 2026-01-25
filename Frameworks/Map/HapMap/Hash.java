import java.util.*;
public class Hash {
    public static void main(String[] args) {
        //in hash map we store value un key value pair
        //does not store keys in sorted order
        
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"Ranjit" );
        hm.put(2,"Savita" );
        hm.put(3,"Shankar" );
        hm.put(4,"Ravi" );     
        System.out.println(hm);   
        System.out.println(hm.get(3));
        System.out.println(hm.get(7));

        hm.remove(2);
        System.out.println(hm.size());
    }
}
