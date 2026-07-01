package SLIDING_WINDOW;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacter {
    public static int lengthOfLongestSubstring(String s){
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        for(int right = 0; right < s.length(); right++){
            while (set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left ++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
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
// Time - O(n)
// Space -O(n)