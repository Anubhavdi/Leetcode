class Solution {
    public boolean wordBreak(String s, List<String> list) {
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                if(dp[j] && list.contains(s.substring(j,i))){
                    dp[i] = true;
                }
            }
        }
        return dp[n];
        
        
        
        
        
        
        
        // TLE 
        // int n = s.length();
        // if(n==0) return true;
        // for(int i=1;i<=n;i++){
        //     if(list.contains(s.substring(0,i)) && wordBreak(s.substring(i,n),list)){
        //         return true;
        //     }
        // }
        // return false;
        
        
        
//         int j=0;
//         int c = 0;
//         for(int i=0;i<s.length();i++){
//             System.out.println(j+" "+i);
//             String str = s.substring(j,i+1);
//             if(list.contains(str)){
                
//                 j=i+1;
//                 c=j;
//                 System.out.println(str+" "+ j +" "+ i);
//             }
//         }
//         if(c==s.length()){
//             return true;
//         }
//         return false;
    }
}