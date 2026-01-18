package Basic;

public class basic {
    void hello(){
        System.out.println("Hello, World!");
    }
    void variables(){
        int number =10;
        System.out.println("");
        System.out.println("1)in int number=10. \n 2)here int is data type \n 3)number is variable name \n  4) 10 is value which us stored in variable"); 
        System.out.println();
        System.out.println("Conditions for variable name: \n 1. should start with letter or _ or $ \n 2. should not contain space \n 3. should not be a keyword \n 4. should be meaningful");
    }
    void dataTypes(){
        System.out.println("Data types in java: \n 1. Primitive data types: byte, short, int, long, float, double, char, boolean \n 2. Non-primitive data types: String, Arrays, Classes, Interface");
    }
    public static void main(String[] args) {
        basic b=new basic();
        b.hello();
        b.variables();
        b.dataTypes();
    }
}
