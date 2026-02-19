public class ReverseArray {

    public static int rArray(int arr[]) {

        int result[] = new int[arr.length];

        helper(arr, result, arr.length - 1, 0);

        for (int num : result) {
            System.out.print(num + " ");
        }

        return 0; 
    }

    private static void helper(int arr[], int result[], int i, int n) {

        if (i < 0) {
            return;
        }

        result[n] = arr[i];

        helper(arr, result, i - 1, n + 1);
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};

        rArray(arr);
    }
}
