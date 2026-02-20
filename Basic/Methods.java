
public class Methods {
    static int l=5;
    static int b=6;
    static float pi=3.14f;
    public static void squareArea(){
        
        System.out.println("Area of Square :"+(l*l));
    }
    public static int rectangleArea(){
    
        return l*b;
    }
    public static float circleArea(int r){
        return pi*r;
    }
    public static void main(String[] args) {
        squareArea();
        System.out.println("Area of Rectanglr :"+rectangleArea());
        System.out.println("Area of Circle :"+circleArea(5));
    }    
}
