package SLIDING_WINDOW;

public class MAX_Consecutive_Ones_III {

    public int longestOnes(int[] arr, int k) {
        int n = arr.length, low = 0, high = 0, max_len = 0;
        int[] freq = new int[2];

        for(high=0;high<n;high++){
            freq[arr[high]]++;
            // int max_ferq = Math.max(freq[0],freq[1]); this is wrong because we can only flip 0's not 1's

            while ((high-low+1) - freq[1]>k) {  // that's why we will shrink the window if the window has no. of zeros > k
                freq[arr[low++]]--;
            }

            max_len = Math.max(max_len, high-low+1);
        
        }
        
        return  max_len;
    }
    public static void main(String[] args) {
        
    }
}
