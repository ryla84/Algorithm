/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithm;

/**
 *
 *
 */
//      Question: Write a function that takes a string, s, as an input and determines whether or not it is a palindrome.
//
public class TwoPointers {
    
    public static boolean isPalindrome(String s){
        
        if(s.length() == 0 || s.length() == 1){
            return true;
        }
        
        int left = 0;
        int right = s.length() -1;
        
        while(left < right){
        if(s.charAt(left)!= s.charAt(right)){
            return false;
        }
        left++;
        right--;   
    }
         return true;
    }
    
    // The time complexity is O(n)
    // The space complexity is O(1)
    
    
    
//    solution by recurssion with time/space complexity of O(n):
    
//    public static boolean isPalindrome(String s) {
//
//        if (s.isEmpty() || s.length() == 1) {
//            return true;
//        }
//
//        char left = s.charAt(0);
//        char right = s.charAt(s.length() - 1);
//
//        if (left != right) {
//            return false;
//        }
//        return isPalindrome(s.substring(1, s.length() - 1));
//    }

}
