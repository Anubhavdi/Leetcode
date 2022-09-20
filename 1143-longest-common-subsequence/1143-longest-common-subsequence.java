class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
         
        char[] str1 = text1.toCharArray();
        char[] str2 = text2.toCharArray();
        int[][] dp = new int[str1.length+1][str2.length+1];
        
        for(int i = 1;i<dp.length;i++){
            for(int j = 1;j<dp[i].length;j++){
                if(str1[i-1]==str2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}