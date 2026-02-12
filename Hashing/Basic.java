// package Hashing;˜

public class Basic {
    public static void main(String[] args) {
        // int[] arr = {5, 6, 5, 6, 9, 6};
        // int count = 0;
        // for (int num : arr) {
        //     if (num == 6) {
        //         count++;
        //     }
        // }
        // System.out.println(count);  
        int[] arr = {5, 6, 5, 6, 9, 6};
        int[] hashTable = new int[10];
        for (int num : arr) {
        hashTable[num]++;
        }
        System.out.println(hashTable[5]);  // Output: 3
        for(int i=0;i<hashTable.length;i++){
            System.out.print(hashTable[i]);
        }
    }
}