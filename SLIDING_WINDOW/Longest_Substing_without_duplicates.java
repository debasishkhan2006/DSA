package SLIDING_WINDOW;

import java.util.HashMap;

public class Longest_Substing_without_duplicates {
    
    
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), low = 0,high = 0,max_len = Integer.MIN_VALUE;
        if(n==0) return 0;
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(high=0;high<n;high++){
            char curr_char = s.charAt(high);

            if(map.containsKey(curr_char)){
                map.put(curr_char, map.get(curr_char)+1);
            }
            else{
                map.put(curr_char, 1);
            
            }
            
            int k = high - low + 1; /* by compareing map size with the window size we are checking that if there are duplicate elements in that window   */
            /* if map size == window size then no duplicates but if map size < window size then there are some duplicate elements present in that window */

            while (map.size() < k) {
                char curr_ch = s.charAt(low);
                map.put(curr_ch,map.get(curr_ch)-1);
                if(map.get(curr_ch)==0){
                    map.remove(curr_ch);
                }
                low++;
                k = high - low + 1;
            }

            max_len = Math.max(max_len, high-low+1);
        }
        
        return  max_len;
    }

    public static void main(String[] args) {
        
    }
}
