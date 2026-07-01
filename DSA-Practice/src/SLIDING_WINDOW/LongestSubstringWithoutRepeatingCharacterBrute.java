package SLIDING_WINDOW;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacterBrute {
    public static int lengthOfLongestSubstring(String s){
        int maxLength = 0;
        for(int i = 0; i < s.length(); i++){
            HashSet<Character> set = new HashSet<>();
            for(int j = i; j < s.length(); j++){
                if(set.contains(s.charAt(j))){
                    break;
                }
                set.add(s.charAt(j));
                maxLength = Math.max( maxLength, j-i+1);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println("Test Case 1");
        String s1 = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s1));
        System.out.println("Test Case 2");
        String s2 = "bbbbb";
        System.out.println(lengthOfLongestSubstring(s2));
        System.out.println("Test Case 3");
        String s3 = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s3));
    }
}
// Time - O(n*n)
// Space -O(n)