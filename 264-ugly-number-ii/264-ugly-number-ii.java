class Solution {
    public int nthUglyNumber(int n) {
        int [] dp = new int[n];
        dp[0]=1;
        int i = 0 , j = 0 , k = 0;
        for(int m=1;m<n;m++){
            int twosMultiple = dp[i]*2;
            int threesMultiple = dp[j]*3;
            int fivesMultiple = dp[k]*5;
            
            dp[m] = Math.min(twosMultiple,Math.min(threesMultiple,fivesMultiple));
            
            if(dp[m]==twosMultiple) i++;
            if(dp[m]== threesMultiple) j++;
            if(dp[m]== fivesMultiple) k++;
        }
        return dp[n-1];
    }
}