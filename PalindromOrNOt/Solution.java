package PalindromOrNOt;

public class Solution {
    public boolean isPalindrome(int x){
        if(x<0){
            return false;
        }
        int reverse =0;
        int digit =0;
        int original = x;
        while (x!=0){
            digit = x%10;
            reverse = reverse*10+digit;
            x = x/10;

            
        }
        if (reverse == original){
            return true;
        }
        else
        return false;
    }
}
