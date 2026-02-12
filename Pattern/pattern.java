// package Pattern;

public class pattern {
    public void pattern1(int n){
        for(int i=1;i<n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            /*
                ****
                ****
                ****
                ****
            */
            System.out.println();
        }
    }
    public void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            /*
                *
                **
                ***
                ****
            */
            System.out.println();
        }
    }
    public void pattern3(int n){
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print( "*");
            }
            /*
                ****
                ***
                **
                *
            */
            System.out.println();
        }
    }
    public void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            /*
                1
                22
                333
                4444
            */
            System.out.println();
        }
    }
    public void pattern5(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            /*
                1
                12
                123
                1234
            */
            System.out.println();
        }
    }
    public void pattern6(int n){
        int count=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=count;j++){
                System.out.print(j);
            }
            /*
                12345
                1234
                123
                12
                1
            */
            System.out.println();
            count--;
        }
    }
    public void pattern7(int n){
        int count=n-1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=count;j++){
               System.out.print(" ");
               
            }
            for(int k=i;k<2*i;k++){
                System.out.print("*");
            }
            System.out.println();
            count--;
            /*
                     *
                    **
                   ***
                  ****
            */
        }
    }
    public void pattern8(int n){
        int count=n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            /*
                    *
                   ***
                  *****
            */
            System.out.println();
        }
    }
    public void pattern9(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            /*
                ***
                 *
             */
            System.out.println();
        }
    }
    public void pattern10(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        /*
            *
            **
            ***
            ****
            ***
            **
            *
        */
    }
    public void pattern11(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
            //    *
            //   ***
            //  *****
            // *******
            // *******
            //  *****
            //   ***
            //    *
    }
    public static void main(String args[]){
            pattern p1= new pattern();
            // p1.pattern1(4);
            // p1.pattern2(5);
            // p1.pattern3(5);
            // p1.pattern4(5);
            // p1.pattern5(4);
            // p1.pattern6(6);
            // p1.pattern7(3);
            // p1.pattern8(4);
            // p1.pattern8(4);
            // p1.pattern9(3);
            // p1.pattern10(4);
            p1.pattern11(4);
    }
}
