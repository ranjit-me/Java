
import java.util.LinkedList;
class Data{
    public Integer num;
    public String name;
    Data(int _num,String _name){
        this.num=_num;
        this.name=_name;
    }
}
public class LinkedListC {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(12);
        ll.add(1);
        ll.addFirst(13);
        ll.addLast(6);

        ll.removeFirst();              // [12, 1, 6]
        ll.remove(Integer.valueOf(1)); // [12, 6]
        ll.removeLast();               // [12]

        System.out.println(ll.getFirst()); // 12
        System.out.println(ll.getLast());  // 12
        System.out.println(ll);            // [12]
    }
}