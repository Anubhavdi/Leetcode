//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().smallestSumSubarray(arr, n)); 
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    static int smallestSumSubarray(int ar[], int size)
    {
        boolean b = true;
        // your code here
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<ar.length;i++){
            min = Math.min(min,ar[i]);
            if(ar[i]<0) b = false;
            ar[i] = -1*ar[i];
        }
        if(b) return min;
        int max = 0;
        int sum = 0;
        for(int i =0;i<ar.length;i++){
            sum = sum + ar[i];
            max = Math.max(sum,max);
            if(sum<0) sum = 0;
        }
        return -1*max;
    }
}