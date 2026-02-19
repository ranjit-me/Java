import Basic.basic;

public class Main {
    public static void basic(){
        byte b=126;
        short s=1234;
        int i=135;
        long l=12386129;
        float f=1243.54f;
        double d=238.1219;
        char c='c';
        boolean boo=true;
        String str="Prathmesh";
        System.out.println(str);
        System.out.println("Byte:-"+b+"\nshort:-"+s+"\n int:-"+i+"\n long:-"+l+"\nfloat:-"+f+"\ndouble:-"+d+"\n char:-"+c+"\n boolean:-"+boo);
    }
    //sattic variables decleared 
    int a=10;  //global var
    
    static int b3=20;
    static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static char c;
    static boolean b2;
    static String str;
    //GlobalVariable static Method is created  
    public static void GlobalVariable(){
        // all decleard variable are called
        System.out.println("Byte "+b);
        System.out.println("Short "+s);
        System.out.println("int "+i);
        System.out.println("long "+l);
        System.out.println("float "+f);
        System.out.println("double "+d);
        System.out.println("Char "+c);
        System.out.println("Boolean "+b2);
        System.out.println("String "+str);
        // System.out.println(a);
        System.out.println("int b3 value initialized "+b3);
        byte c1 =123;
        //  the local variable is intialized
        // local variable should be initialized before utilization
         c1 = 111;
        //  local varibale can be reintialized again
         System.out.println(c1);
        //  printing of local variable
    }
    //
    public static void operations(){
        int a=10;
        int b=6;
        int c=18;
        //Arithmatic operation
        System.out.println("A+B: "+(a+b));
        System.out.println("A-B: "+(a-b));
        System.out.println("A*B: "+(a*b));
        System.out.println("A/B: "+(a/b));
        System.out.println("A%B: "+(a%b));

        //relational operators
        System.out.println("a>b"+(a>b));
        System.out.println("a<b"+(a<b));
        System.out.println("a>=b"+(a>=b));
        System.out.println("a<=b"+(a<=b));
        System.out.println("a!=b"+(a!=b));
        System.out.println("a==b"+(a==b));

        //logical operator
        System.out.println("a<b && a>c:"+(a<b && b>c));
        System.out.println("a<b && a<c:"+(a<b && b<a));
        System.out.println("a>b && a<c:"+(a>b && b<a));
        System.out.println("a<b || a>a:"+(a<b || b>a));
        System.out.println("a<b || a<c:"+(a<b || b<a));
        System.out.println("a>b || a<c:"+(a>b || b<a));

        //uniary operator
        System.out.println(--a);
        System.out.println(a++);
        System.out.println(a);

        //ternary oprerator
        int max=(a>b)?a:b;
        System.out.println(max);
        
        //assignment operator
        System.out.println(a+=a);
        System.out.println(a*=a);
        System.out.println(a%=a);
        System.out.println(a-=a);
        System.out.println(b/=b);
        // System.out.println(a);

    }
    public static void main(String[] args) {
        // basic();
        //Method called here 
        // GlobalVariable();
        operations();
    }
}
