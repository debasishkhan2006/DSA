public class XOR_of_a_given_range {

    // Important Observation ****
    public static int xor(int n){
        int r = n%4;
        int xor = 0;
        if(r==0) {
            xor = n;
        }
        else if (r==1){
            xor = 1;
        }
        else if (r==2){
            xor = n + 1;
        }
        else{  //r = 3
            xor = 0;
        }
        return xor;
    }
    public static int findXOR(int a, int b) {

        // Calculating Xor from [1,(a-1)]
        int xor1 = xor(a-1);

        // Calculating Xor from [1,b]
        
        int xor2 = xor(b);

        int ans = xor2 ^ xor1;
        
        return ans;
    }

}
