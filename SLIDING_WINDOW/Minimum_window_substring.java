package SLIDING_WINDOW;

public class Minimum_window_substring {

    // Basic Logic => we will find the start index and the number of characters min window substring which satisfies the given condition then get the string using substring method
    // T.C = O(m)

    public boolean valid_string(int[] freq_s,int[] freq_t){
        for(int i=0;i<256;i++){
            if(freq_s[i]<freq_t[i]) return  false;
        }
        return  true;
    }

    public String minWindow(String s, String t) {
        int m = s.length(), n = t.length(),low = 0,high = 0;
        
        if(m < n) return "";

        int[] freq_s = new int[256];
        int[] freq_t = new int[256];

        int start = 0;
        int ans_len = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            freq_t[t.charAt(i)]++;
        }
        
        for(high=0;high<m;high++){
            char ch = s.charAt(high);
            freq_s[ch]++;
            
            while((high-low+1)>=n && valid_string(freq_s,freq_t)){
                
                int len = high - low + 1;
                if(len < ans_len){
                    ans_len = len;
                    start = low;
                }
                freq_s[s.charAt(low)]--;
                low++;
            }

        }
        if(ans_len==Integer.MAX_VALUE) return  "";
        String ans = s.substring(start,start+ans_len);
        return  ans;
    }
    public static void main(String[] args) {
        
    }
}
