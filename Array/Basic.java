
public class Basic {
    public static void singleDime(){
        int arr[]=new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        // System.out.println(arr[2]);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int arr2[]={1,2,3,4,5};
        Object arr3[]=new Object[3];
        
    }

    public static void multiDime(){
        int arr[][]={{1,2,3},{4,5,6}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        // System.out.println(arr[0]);
    }
    public static void main(String[] args) {
        // singleDime();
        multiDime();
    }    
}
