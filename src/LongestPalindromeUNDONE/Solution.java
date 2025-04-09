package LongestPalindromeUNDONE;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int longestPalindrome(String s) {
        int result = 0;
        Map<Character , Integer> chars = new HashMap<>();
        for (char c : s.toCharArray()){
            chars.put(c , chars.getOrDefault(c,0) +1);
        }

        int palindromeLength = 0;
        boolean hasOddFrequency = false;
        for (int count : chars.values()) {
            palindromeLength += count / 2 * 2;
            if (count % 2 != 0) {
                hasOddFrequency = true;
            }
        }

        if (hasOddFrequency) {
            palindromeLength += 1;
        }


        return result;
    }
}
