//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int Arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxSumIS(Arr,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
	public int maxSumIS(int arr[], int n)  
	{  
	    //code here.
	    int[] dp = new int[n];
	    for(int i=0;i<n;i++){
	        dp[i]=arr[i];
	    }
	    int m = 0;
	    for(int i=0;i<n;i++){
	        for(int j=0;j<i;j++){
	            if(dp[j]<dp[i]){
	                dp[i] = Math.max(dp[i],arr[i]+dp[j]);
	            }
	        }
	    }
	    
	    for(int i=0;i<n;i++){
	        m = Math.max(m,dp[i]);
	    }
	    return m;
	}  
}