package SLIDING_WINDOW;

public class MAX_SubarraySum {
    public int maxSubarraySum(int[] arr, int k) {
        int n = arr.length,low = 0,high = k-1;
        int curr_sum = 0,max_sum = -1;
        for(int i=0;i<k;i++) curr_sum += arr[i];

        

        while (high < n) {
            curr_sum = curr_sum - arr[low];
            low++;high++;
            curr_sum += arr[high];
            max_sum = Math.max(curr_sum,max_sum);
        }
        // Code here
        return  max_sum;
        
    }   
}
