/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithm;

/**
 *
 *
 */
//Write an algorithm to determine if a number is a happy number.
//We use the following process to check if a given number is a happy number:
//Starting with the given number n, replace the number with the sum of the squares of its digits.
//Repeat the process until:The number equals 1, which will depict that the given number n is a happy number.
//It enters a cycle, which will depict that the given number n is not a happy number.
//Return TRUE if n is a happy number, and FALSE if not.

public class HappyNumber {

    public static int sumSquaredDigits(int num) {
        int totalSum = 0;
        
        while (num != 0) {
            int digit = num % 10;
            num = num/10;
            totalSum += (Math.pow(digit, 2));
        }
        return totalSum;
    }
    
    public static boolean isHappyNumber (int n){
    int slow = n;
    int fast = sumSquaredDigits(n);
    
   while(fast != 1 && slow != fast){
       slow = sumSquaredDigits(n);
       fast = sumSquaredDigits(sumSquaredDigits(n));
   }
   return fast == 1;

    }
}
