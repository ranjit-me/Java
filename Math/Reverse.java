// Reverse a number

public class Reverse {
    public int reverseNumber(int n){
        int sum=0;
        while(n>0){
            int lastDigit=n%10;
            sum=(sum*10)+lastDigit;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Reverse r1=new Reverse();
        r1.reverseNumber(1234);
        System.out.println(r1.reverseNumber(1234));
    }
}
