/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithm;

import java.util.Arrays;

/**
 *
 *
 */
//Question: Given an array of integers, nums, and an integer value, target,
//determine if there are any three integers in nums whose sum is equal to the target
//
public class SumOfThreeValues {

    public static boolean threeValueSum(int[] nums, int target) {

        Arrays.sort(nums);
        
        if (nums.length <= 2) {
            return false;
        }

        for (int i = 1; i < nums.length - 2; i++) {
            int left = nums[0];
            int right = nums.length -1;

            while (left < right) {
                int sum = nums[left] + nums[right] + nums[i];

                if (sum == target) {
                    return true;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return false;
    }
}
