public class Reverse_bits {

    // T.C = O(32) S.C = O(32)
    public static  void reverseBits(int n) {
        int ans = 0;
        String s = "";
        int temp = n;
        for(int i=0;i<32;i++){
            s += temp%2;
            temp = temp >> 1;
        }
        StringBuilder rev  = new StringBuilder(s);

        System.out.println(rev);
        rev.reverse();
        for(int i=0;i<rev.length();i++){
            ans  += (1<<i) * (rev.charAt(i)-'0');
        }

        System.out.println(ans);
        
    }

    // Best Solution
    // T.C = O(32) S.C = O(1)
    public static int reverseBits1(int n) {
        int ans = 0;
        for(int i=0;i<32;i++){
            if(n%2!=0){
                int mask = (1 << (31-i));
                ans = ans ^ mask;
            }
            n = n >> 1;
        }
        return  ans;
    }


    public static int reverseBits2(int n) {
        int i = 0,j = 31;
        while (i<j) {
            int imask = (1<<i);
            int jmask = (1<<j);

            // Check ith and jth bits are on or off
            boolean i_on = ((n & imask) != 0);
            boolean j_on = ((n & jmask) != 0); 

            if(i_on!=j_on){
                // Flip both bits using mask
                n = n ^ imask;
                n = n ^ jmask;
            }

            i++;j--;
        }
        return  n;
    }

}
