public class Squares_of_a_Sorted_Array {

    // T.C = O(N) S.C = O(N)
    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        
        int i = 0,j=0,k=0;
        while (j<n && arr[j]<0) {
            j++;
        }
        i = (j==0) ? 0 : (j-1);
        
        for(int u=0;u<n;u++) arr[u] *= arr[u];

        if(j==0) return arr; // array contains only +ve numbers

        while (i>=0 && j<n) {
            if(arr[i]<arr[j]){
                ans[k++] = arr[i--];
            }
            else{
                ans[k++] = arr[j++];
            }
        }

        while (i>=0 && k<n) {
            ans[k++] = arr[i--]; 
        }

        while (j<n && k<n) {
            ans[k++] = arr[j++];
        }

        return  ans;
    }
    public static void main(String[] args) {
        
    }
}
