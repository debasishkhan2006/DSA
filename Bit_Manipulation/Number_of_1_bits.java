

public class Number_of_1_bits {


    // T.C = O(32)
    public int hammingWeight1(int n) {
        int count = 0;
        while(n>0){
            if(n%2!=0) count++;
            n = n >> 1;
        }
        return count;
    }


    // Best Solution O(count)
    public int hammingWeight2(int n) {
        int count = 0;
        while(n!=0){
            count++;
            n = n & (n-1);
        }
        return count;
    }


    //Min bit flips to convert a number 

    // T.C = O(32)
    public int minBitFlips(int start, int goal) {
        int ans = start,k = 0,count = 0,c_goal = goal;
        int mask = 1;
        while(ans!=goal){
            if(c_goal%2!=0){
                if(start%2==0) {
                    mask = mask << k;
                    ans = ans ^ mask;
                    count++;
                }
            }
            else{ // c_goal%2==0
                if(start%2!=0){
                    mask = mask << k;
                    ans = ans ^ mask;
                    count++;
                }
            }
            start = start >> 1;
            c_goal = c_goal >> 1;
            k++;
        }
        return count;
    }


    // T.C = O(count)  (Best Solution)
    public int minBitFlips1(int start, int goal) {
        int ans = start ^ goal;
        int count = 0;
        while(ans!=0){
            count++;
            ans = ans & (ans-1);
        }
        return count;
    }



    

}
