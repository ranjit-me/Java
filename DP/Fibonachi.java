public class Fibonachi {
    // memolization dp
    public static int  fibMemolize(int n,int dp[]){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=0){//dp(n)is already calculated
            return dp[n];
        }
        dp[n]=fibMemolize(n-1,dp)+fibMemolize(n-2,dp);
        return dp[n];
    }
    //tabulation dp
    public static int fibTablulat(int n){
        int dp[]=new int[n+1];
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n=5;
        int dp[]=new int[n+1];
        System.out.println(fibMemolize(n,dp));
        System.out.println(fibTablulat(5));
    }    
}
