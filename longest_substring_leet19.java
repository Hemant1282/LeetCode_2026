import java.util.*;

public class longest_substring_leet19 {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[256];
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right)]++;

            while (freq[s.charAt(right)] > 1) {
                freq[s.charAt(left)]--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

}
