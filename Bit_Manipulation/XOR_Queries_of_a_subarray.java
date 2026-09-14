
public class XOR_Queries_of_a_subarray {

    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = queries.length;
        int[] ans = new int[n];

        for(int i=1;i<arr.length;i++){
            arr[i] = arr[i] ^ arr[i-1];
        }

        for(int i=0;i<n;i++){
            int a = queries[i][0] , b = queries[i][1];
            if(a==0){
                ans[i] = arr[b];
            }
            else{
                ans[i] = arr[a-1] ^ arr[b];
             }

        }
        return ans;
    }
    
}