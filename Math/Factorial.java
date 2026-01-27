public class Factorial {
    public int fact(int n){
        if(n==0)return 1;
        int sum=1;
        for(int i=1;i<=n;i++){
            sum=sum*i;          
        }
        return sum;
    }
    public static void main(String[] args) {
        Factorial f1=new Factorial();
        f1.fact(4);
        System.out.println(f1.fact(4));
    }
}
