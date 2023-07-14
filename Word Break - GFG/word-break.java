//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n;
                    n = sc.nextInt();
                    ArrayList<String> arr = new ArrayList<String>();
                    for(int i = 0;i<n;i++)
                        {
                            String p = sc.next();
                            arr.add(p);
                        }
                    String line = sc.next();
                    Sol obj = new Sol();  
                    System.out.println(obj.wordBreak(line,arr));  
                    
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int wordBreak(String s, ArrayList<String> list )
    {
        //code here
        
        boolean[] dp = new boolean[s.length()+1];
        dp[0]= true;
        for(int i=0;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(dp[j] && list.contains(s.substring(j,i))){
                    dp[i] = true;
                }
            }
        }
        return dp[s.length()] ? 1 : 0;
        
        
        
        
        // return solve(s,list)?1:0;
    }
    
    // public static boolean solve(String s, ArrayList<String> list){
        
        
        
        
        
        
        // int n = s.length();
        // if(n==0) return true;
        // for(int i=1;i<=n;i++){
        //     if(list.contains(s.substring(0,i))){
        //         if(solve(s.substring(i,n),list)){
        //             return true;
        //         }
        //     }
        // }
        // return false;
    // }
}