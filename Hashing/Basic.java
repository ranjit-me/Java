// package Hashing;˜

public class Basic {
    public static void main(String[] args) {
        int[] arr = {5, 6, 5, 6, 9, 6};
        int count = 0;
        for (int num : arr) {
            if (num == 6) {
                count++;
            }
        }
        System.out.println(count);  
    }
}