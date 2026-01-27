
public class Lnumber {
    public int largetNumber(int n){
        int num=0;
        while(n>0){
            int lastDigit=n%10;
            if(lastDigit>num){
                num=lastDigit;
            }
            n/=10;
        }
        return num;
    }
    public static void main(String[] args) {
        Lnumber l1=new Lnumber();
        l1.largetNumber(1243);
        System.out.println(l1.largetNumber(1243));
    }
}
