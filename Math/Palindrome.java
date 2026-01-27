
public class Palindrome {
    public boolean pali(int n){
        int num=n;
        int reverseNumber=0;
        while(num>0){
            int lastDigit=num%10;
            reverseNumber=(reverseNumber*10)+lastDigit;
            num/=10;
        }
        if(n==reverseNumber)return true;
        return false;
    }
    public static void main(String[] args) {
        Palindrome p1=new Palindrome();
        p1.pali(121);
        System.out.println(p1.pali(121));
    }
}
