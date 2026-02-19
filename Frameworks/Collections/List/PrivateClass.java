// Constructor is Created for class


// check how constructor works

// 1)Custome Class
// 2)Collection 
//   a)List
//    i)ArrayList
//    ii)LinkedList
//    iii)Stck
//    iv)Vector
//   b)Set
//     i)HashSet
//     ii)TreeSet
//   c)Queue
//     i)ArrayQueue
//     ii)LinkedList(as Queue)
//     iii)PriorityQueuse
// 3)Map
//   a)HashMap
//   b)TreeMap
// 4)Iterator
//   a)ListIterator
// 5)Custom Comparator
// 6)Commom Algorithms

import Arraylist.Data;

class Data{
    private Integer num;
    private String name;
    private InternalData internalData;
    Data(int _num,String _name,int _revenue){
        this.num=_num;
        this.name=_name;
        this.internalData=new InternalData(_revenue);
    }
    public void setNumber(Integer _num){
        this.num=_num;
    }
    public void setName(String _name){
        this.name=_name;
    }
    public void setRevenue(Integer revenue){
        this.internalData=new InternalData(revenue);
    }
    public int getNum(){
        return num;
    }
    public String getName(){
        return name;
    }
    ///IMP
    public int getRevenue(){
        return this.internalData.revenue;
    }
}
class InternalData{
    public Integer revenue;
    InternalData(Integer _revenue){
        this.revenue=_revenue;
    }
}
public class PrivateClass {
    public static void main(String[] args) {
        Data d1=new Data(12,"Ranjit",1200);
        Data d2=new Data(24,"Raaj",1300);
       d1.setName("Shankar");
       System.out.println(d1.getRevenue());
    }
}
