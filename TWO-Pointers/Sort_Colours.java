public  class Sort_Colours {
    
    public void sortColors(int[] arr) {
        int n = arr.length, zero = 0, one = 0, two = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) zero++;
            else if(arr[i]==1) one++;
            else two++;
        }

        for(int i=0;i<n;i++){
            if(zero>0) {
                arr[i] = 0;
                zero--;
            }
            else if(one>0){
                arr[i] = 1;
                one--;
            }
            else if(two>0){
                arr[i] = 2;
                two--;
            }
        }
    }


    // One Pass Solution (Best Solution) => Dutch National Flag Algorithm
    public void sortColors1(int[] arr) {
        int n = arr.length, low = 0, mid = 0, high = n-1,temp = 0;

        while (mid <= high) {
            if(arr[mid]==0){
                //Swap low and mid
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++; // because we assumed that from [low,mid-1] only 1 will come
            }
            else if(arr[mid]==1) {
                mid++; 
            }
            else{  // arr[mid] == 2
                // swap with high
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
                // mid++; we can't do this because we don't know what will come from arr[mid]
                // because [mid,high] is the unsorted area so, out of {0,1,2} anything can come
            }
        }
        
    }
    public static void main(String[] args) {
        
    }
}