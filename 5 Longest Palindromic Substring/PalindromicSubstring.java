import java.util.HashMap;
import java.util.Map;

class Solution {
   //bruteforce method
//    public String longestPalindrome(String s){
//     if(s.length() <=1 ){
//         return s;
//     }
//     int maxLen = 1;
//     String maxStr = s.substring(0, 1);
//     for (int i = 0; i<s.length(); i++){
//         for(int j= i+maxLen; j<s.length(); j++){
//             if(j-i > maxLen && isPalindrome(s.substring(i,j))){
//                 maxLen = j-i;
//                 maxStr=s.substring(i,j);
//             }
//         }
//     }
//     return maxStr;
//    }
//    private boolean isPalindrome(String str){
//     int left = 0;
//     int right = str.length() - 1;

//     while (left < right){
//         if(str.charAt(left) != str.charAt(right)){
//             return false;
//         }
//         left ++;
//         right --;

//     }
//     return true;


//Expand around center method
public String longestPalindrome(String s){
    if(s.length()<=1){
        return s;
    }
    String maxStr = s.substring(0,1);
    for(int i = 0; i<s.length()-1; i++){
        String odd = expandFromCenter(s,i,i);
        String even = expandFromCenter(s,i,i+1);

        if(odd.length()>maxStr.length()){
            maxStr = odd;
        }
        if (even.length()>maxStr.length()){
            maxStr = even;
        }
    }
    return maxStr;
}


private String expandFromCenter(String s, int left, int right){
    while(left>=0 && right <s.length() && s.charAt(left) == s.charAt(right)){
        left --;
        right ++;
    }
    return s.substring(left+1, right);
}
}