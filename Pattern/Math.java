
public class Math {
    public int count(int n){
        int num=n;
        int cu=0;
        if(n==0)return 1;
        while (num>0) {
            num=num/10;
            cu++;
        }
        return cu;
    }
    public int reverseNumber(int n){
        int num=n;
        if (num==0)return 0;
        while (num>0) {
            num=
        }
    }
    public static void main(String[] args) {
        Math m1=new Math();
        System.out.println(m1.count(0));
    }    
}
