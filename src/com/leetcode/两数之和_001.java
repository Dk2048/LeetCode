package com.leetcode;

public class 两数之和_001 {
    //暴力法，直接遍历数组
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i + 1; j <nums.length; j++){
                if(nums[i] + nums[j] == target)
                    return new int[]{i,j};
                }
            }
        return null;
        }
    
    public static void main(String[] args) {
        int[] nums = {2, 7 ,11, 15};
        int target = 17;
        int[] result = twoSum(nums, target);
        System.out.println("target: " + target + " = nums[" + result[0] +"] + nums[" + result[1] + "]" );
        }
}