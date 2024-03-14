/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package algorithm;

/**
 *

 */
//Given an unsorted array of positive numbers, nums, such that the values lie in the range [1, n],inclusive, 
//and that there are numbers in the array, find and return the duplicate number present in nums. There is only one repeated number in nums.

public class FindDuplicateNumber {
    
    public static int findDublicate(int[] nums){
        
        if(nums.length <= 1) return -1;

            int slow = nums[0];
            int fast = nums[0];
            
            while(true){
                slow = nums[slow];
                fast = nums[nums[fast]];
                
                if(slow == fast)
                    break;
            }
            
         slow = nums[0];
         while(slow != fast){
             slow = nums[slow];
             fast = nums[fast];
         }
         return fast;
        
    }

}
