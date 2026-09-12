public class Count_Commas {
    public int countCommas(int n) {
        if(n<1000) return  0;
        return Math.abs(n-1000+1);

    }
    
}