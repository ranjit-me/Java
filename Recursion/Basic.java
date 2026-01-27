
public class Basic {
    public static void print(){
        System.out.println("Hello");
        for(int i=1;i<5;i++){
            print();
        }
    }
public static void main(String[] args) {
    System.out.println("Ranji");
    print();
}    
}
