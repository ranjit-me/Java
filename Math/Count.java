
// Count all Digits of a Number
import java.util.*;
public class Count {
    //count using a while loop 
    public int countD(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
    //Count using a Math.log10(n)
    public int countDigit(int n){
        int count=(int)(Math.log10(n)+1);
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Count s1=new Count();
        System.out.println(s1.countDigit(12));
        System.out.println(s1.countD(199));
    }
}
