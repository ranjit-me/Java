// 1. Two Sum
// Solved
// Easy

// Topics
// premium lock icon
// Companies

// Hint
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

 

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public int []twoSum(int []nums,int target){
        int start=0;
        int secondIndex=1;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
     public List<int[]> twoSumAll(int[] nums, int target) {

        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    result.add(new int[]{i, j});
                }
            }
        }
        return result;
    }
    public static void main(String args[]){
        Problem1 p1=new Problem1();
        int arr[]={1,3,5,7,8,9,4};
        int result[]=p1.twoSum(arr, 9);
        if (result.length > 0) {
            System.out.println(result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found");
        }
        
        //if need to find all pairs 
        List<int[]> results = p1.twoSumAll(arr, 9);

        for (int[] pair : results) {
            System.out.println(pair[0] + ", " + pair[1]);
        }
    }
}
