

public class Basic_Operations {
    static boolean checkKthBit(int n, int k) {
        int ans = n<<(32-k-1);
        ans = ans >> (31);
        System.err.println(ans);
        if(ans!=0) return true;
        return false;
    }

    static boolean checkKthBit2(int n, int k) {
        int mask = 1 << k;
        int ans = n & mask;
        if(ans==0) return false;
        return true;
    }

    static boolean checkKthBit3(int n, int k) {
        n = n >> k;
        return (n%2!=0);
    }

    static int setKthBit(int n, int k) {
        int mask = 1 << k;
        n = n | mask;
        return n;
    }

    static int UnsetKthBit(int n, int k) {
        int mask = ~(1 << k);
        n = n & mask;
        return n;
    }

    static int ToggleKthBit(int n, int k) {
        int mask = 1 << k;
        n = n ^ mask;
        return n;
    }

    //Turn off RightMost bit
    static int UnsetRMBit(int n){
        int k = 0;
        int temp = n;
        while (temp>0) {
            if(temp%2!=0) break;
            k++;
            temp = temp >> 1;
        }

        int mask = ~(1 << k);
        n = n & mask;
        return n;

    }

    // Best Solution
    static int UnsetRMBit1(int n){
        return n & (n-1);
    }


    public static void main(String[] args) {
        System.out.println(UnsetRMBit(20));
    }
    
}
