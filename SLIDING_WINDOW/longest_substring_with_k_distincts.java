package SLIDING_WINDOW;

import java.util.HashMap;

public class longest_substring_with_k_distincts {

    // T.C = O(n) S.C = O(n)
    public int longestKSubstr(String s, int k) {
        // code here
        int n = s.length(), low = 0,high = 0, longest_len = Integer.MIN_VALUE;
        HashMap<Character,Integer> map = new HashMap<>();

        for(high=0;high<n;high++){
            char ch = s.charAt(high);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
            
            while (map.size()>k) {
                char curr_ch = s.charAt(low);
                map.put(curr_ch,map.get(curr_ch)-1);
                if(map.get(curr_ch)==0){
                    map.remove(curr_ch);
                }
                low++;
            }

            if(map.size()==k){
                longest_len = Math.max(longest_len, high-low+1);
            }
            
        }

        return  longest_len==Integer.MIN_VALUE ? -1 : longest_len;
    }
    public static void main(String[] args) {
        
    }
}
