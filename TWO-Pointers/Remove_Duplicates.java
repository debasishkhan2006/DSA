public class Remove_Duplicates {

    // Given array is sorted and (it returns the number of unique elements)
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        int i = 0,j = 0,uniqes = 0;

        while(j<n){
            if(arr[i]!=arr[j]){
                arr[++i] = arr[j];
                uniqes++;
            }
            j++;
        }
        uniqes++;
        return uniqes;  // for last unique element

    }



    // for atmost m elements compare with arr[i-m]
    
    public int removeDuplicates2(int[] arr) {
        int n = arr.length,i = 2;
        for(int j=2;j<n;j++){
            if(arr[j]!=arr[i-2]){
                arr[i] = arr[j];
                i++;
            }
        }
        return i;
        

    }



    public static void main(String[] args) {
        
    }
}
