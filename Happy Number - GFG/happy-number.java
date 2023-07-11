//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isHappy(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution { 
  
     static int isHappy(int n) { 
         //code here
         List<Integer> list = new ArrayList<>();
        while(n!=1){
            int temp = n;
            n = 0;
            while(temp>0){
                n += Math.pow((temp%10),2);
                temp/=10;
            }
            if(list.contains(n)) return 0;
            else list.add(n);
        }
        return 1;
     }
}