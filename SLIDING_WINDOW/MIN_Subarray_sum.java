package SLIDING_WINDOW;
public class MIN_Subarray_sum {
    public int minSubArrayLen(int target, int[] arr) {
        int n = arr.length;
        if(n==1){
            if(arr[0] >= target) return 1;
            return 0;
        }

        int low = 0,high = 0, min_length = Integer.MAX_VALUE,sum = 0;
        while(high<n){
            sum += arr[high]; // add the element

            while(sum>=target){ // remove until sum >= target
                min_length = Math.min(high-low+1,min_length);
                sum -= arr[low++];
            }

            high++; // add next element
        }

        return min_length == Integer.MAX_VALUE ? 0 : min_length;
    }
    public static void main(String[] args) {
        
    }
}
