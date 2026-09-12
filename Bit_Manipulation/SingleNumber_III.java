import java.util.HashMap;

public class SingleNumber_III{


    // T.C = O(n) S.C = O(n)

    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums){
            if(map.containsKey(ele)) map.put(ele,map.get(ele)+1);
            else map.put(ele, 1);
        }
        int[] ans = new int[2];
        int i = 0;
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(freq==1) ans[i++] = key;
        }
        return  ans;
    }


    // Best Solution T.C = O(n) S.C = O(1)

    
    public int[] singleNumber1(int[] nums) {
        
        int xor = 0,b1 = 0,b2 = 0;
        for(int ele : nums) xor = xor ^ ele;

        // Create a mask, and there will be only one set bit, the rightmost set bit
        // in xor, in the mask the set bit will be at that position and all other bits
        // will be zero

        int[] ans = new int[2];

        int x = xor & (xor-1);
        int mask = x ^ xor;

        for (int ele : nums){
            int a = ele & mask;
            if (a!=0) b1 = b1 ^ ele;
            else b2 = b2 ^ ele;
        }
        
        ans[0] = b1;
        ans[1] = b2;
        return  ans;
    }



    public static void main(String[] args) {
        
    }
}