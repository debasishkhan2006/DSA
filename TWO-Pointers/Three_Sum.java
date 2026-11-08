import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_Sum {

    public List<List<Integer>> threeSum(int[] arr) {
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            if(i>=1 && arr[i]==arr[i-1]) continue;
            // now apply the concept of two sum for sorted array
            int j = i+1,k = n-1;
            int target = -1 * arr[i];
            while (j<k) {
                int sum = arr[j] + arr[k];
                List<Integer> x = new ArrayList<>();
                if(sum==target){
                    x.add(arr[i]);
                    x.add(arr[j]);
                    x.add(arr[k]);
                    ans.add(x);
                    j++;k--;
                    while(j<n && arr[j]==arr[j-1]) j++;
                    while(k>=0 && arr[k]==arr[k+1]) k--;

                }
                else if(sum<target){
                    j++;
                }
                else{ 
                    k--;
                }
            }

        }
        return ans;
    }


    // Q: 3-Sum Closest
    public int threeSumClosest(int[] arr, int target) {
        int n = arr.length;
        Arrays.sort(arr);
        int ans = 50000;

        for(int i=0;i<n-2;i++){
            // now apply the concept of two sum for sorted array
            int j = i+1,k = n-1;
            while (j<k) {       
                int sum = arr[i] + arr[j] + arr[k];
                if(sum==target) {
                    return sum;
                }
                int prev_pair_diff = Math.abs(target - ans);
                int new_pair_diff = Math.abs(target - sum);

                ans = prev_pair_diff < new_pair_diff ? ans : sum;
                
                if(sum<target){
                    j++;
                }
                else{ 
                    k--;
                }
            }

        }
        return ans;
    }

    //count the number of unique triplets of elements whose sum is strictly less than sum.
    
    int countTriplets(int target_sum, int arr[]) {
        // code here
        int n = arr.length,count = 0;
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            int j = i + 1, k = n-1;
            while (j < k) {
                int curr_sum = arr[i] + arr[j] + arr[k];
                if(curr_sum < target_sum) {
                    count += k - j;
                    j++;
                    
                }
                else{
                    k--;
                }

            }
        }

        return count;
    }
    public static void main(String[] args) {
        
    }
}
