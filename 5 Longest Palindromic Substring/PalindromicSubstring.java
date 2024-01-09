import java.util.HashMap;
import java.util.Map;

class Solution {
    public String longestPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        Map<Integer, String> map = new HashMap<>();
        for(int i = 0; i <s.length(); i++){
            for(int j= 0; j<i; i++){
                if(map.containsValue(s.charAt(j))){
                    
                }
            }
        } 
        return null;
    }
}