class Solution {
    public int longestPalindromeSubseq(String s) {
        // int[][] dp = new int[s.length()][s.length()];
        
        // for (int i = s.length() - 1; i >= 0; i--) {
        //     dp[i][i] = 1;
        //     for (int j = i+1; j < s.length(); j++) {
        //         if (s.charAt(i) == s.charAt(j)) {
        //             dp[i][j] = dp[i+1][j-1] + 2;
        //         } else {
        //             dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
        //         }
        //     }
        // }
        // return dp[0][s.length()-1];

        StringBuilder s2 = new StringBuilder();
        s2.append(s);
        s2.reverse();
        String str  = s2.toString();
        return LCS(s,str);
    }

    public int LCS(String s1,String s2){
        int m = s1.length();
        int n = s2.length();
        int len = 0;
        int[][] dp  = new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }else if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                    //len  = Math.max(len,dp[i][j]);
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}