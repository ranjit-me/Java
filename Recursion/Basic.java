
public class Basic {
    public  void print(){
        
        for(int i=0;i<5;i++){
            System.out.println("Hello");
            print();
        }
        // print();
        return;
    }
public static void main(String[] args) {
    Basic b1=new Basic();
    b1.print();
}    
}
