public class LongestSubstring {
    public int lengthofLongestSubstring(String s){
    int maxLength = 0;
    for (int left = 0, right = 0; right<s.length(); right++){
        int foundIndex = s.indexOf(s.charAt(right), left);
        if(foundIndex != right){
            left = foundIndex + 1;
        }
        maxLength = Math.max(maxLength, right - left + 1);
    }
    return maxLength;
}
}
