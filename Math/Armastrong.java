public class Armastrong {
    public int countDigit(int n){
        int count=(int)Math.log10(n)+1;
        return count;
    }
    public boolean armas(int n){
        int count=countDigit(n);
        int num=n;
        int sum=0;
        while(num>0){
            int lastDigit=num%10;
            sum +=Math.pow(lastDigit,count);
            num/=10;
        }
        if(sum==n)return true;
        return false;
    }
    public static void main(String[] args) {
        Armastrong a1=new Armastrong();
        a1.armas(153);   
        System.out.println(a1.armas(153));
    }
}
