
public class Odd {
    public int count(int n){
        int count=0;
        while (n>0) {
            int lastDigit=n%10;
            if(lastDigit%2!=0){
                count++;
            }
            n=n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Odd o1=new Odd();
        System.out.println("Ranjit");
        System.out.println(o1.count(34));
    }
}
