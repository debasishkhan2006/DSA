import java.util.*;

public class Subsets{

    // T.C = O(n * 2^n) A.S = O(1)
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        int no_of_subsets = (1<<n);

        for(int i=0;i<no_of_subsets;i++) {
            List<Integer> a = new ArrayList<>();
            int x = i;
            for(int j=0;j<n;j++){
                if(x%2!=0) a.add(nums[j]);
                x = x >> 1;
            }
            ans.add(a); 
        }
        return ans;
    }
    
}