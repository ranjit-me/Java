
public class Sum {
    public static int s(int n){
        if(n == 0){     // safer base condition
            return 0;
        }
        return n + s(n-1);
    }

    public static void main(String[] args) {
        System.out.println(s(5));
    }
}
