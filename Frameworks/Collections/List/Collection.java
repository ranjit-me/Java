
import java.util.*; 

class Data{
    public Integer num;
    public String name;
    Data(int _num,String _name){
        this.num=_num;
        this.name=_name;
    }
}
public class Collection {
//ArrayList
 public static void main(String[] args) {
    ArrayList<Integer>aList=new ArrayList<>();
    aList.add(12);
    aList.add(13);
    aList.add(12);
    aList.add(13);
    aList.add(12);
    aList.add(13);
    System.out.println(aList);
    System.out.println(aList.size());
    System.out.println(aList.get(2));
    System.out.println(aList.remove(2));
    aList.add(1,18);
    aList.clear();
    aList.contains(23);

 }   
}
