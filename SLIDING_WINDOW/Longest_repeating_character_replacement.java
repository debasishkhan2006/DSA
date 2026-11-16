package SLIDING_WINDOW;

import java.util.HashMap;

public class Longest_repeating_character_replacement {

    public int longestSubstr(String s, int k) {
    int n = s.length();
    int low = 0, max_len = 0, max_freq = 0;

    HashMap<Character, Integer> map = new HashMap<>();

    for (int high = 0; high < n; high++) {
        char ch = s.charAt(high);

        map.put(ch, map.getOrDefault(ch, 0) + 1);

        max_freq = Math.max(max_freq, map.get(ch));

        while ((high - low + 1) - max_freq > k) {
            char curr = s.charAt(low);

            map.put(curr, map.get(curr) - 1);

            if (map.get(curr) == 0) {
                map.remove(curr);
            }

            low++;
        }
            max_len = Math.max(max_len, high - low + 1);
        }

        return max_len;
    }
    
    public static void main(String[] args) {
        
    }
}
