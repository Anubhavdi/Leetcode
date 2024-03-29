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
  
  
  public static int numSquareSum(int n){
        int sum = 0;
        while(n!=0){
            sum += (n%10)*(n%10);
            n/=10;
        }
        return sum;
    }
    
     static int isHappy(int n) { 
         //code here
          int slow, fast;
        slow = fast = n;
        do
        {
            slow = numSquareSum(slow);
            fast = numSquareSum(numSquareSum(fast));
        }
        while (slow != fast);
        return (slow == 1) ? 1 :0;
         
         
         
        //  Set<Integer> set = new HashSet<>();
        // while(true){
        //     n = numSquare(n);
        //     if(n==1) return 1;
        //     if(set.contains(n)) return 0;
        //     set.add(n);
        // }
        
         
         
         
         
         
        //  if(n==1 || n==7) return 1;
        // int sum=n,temp=n;
        // while(sum>9){
        //     sum=0;
        //     while(temp>0){
        //         int s=temp%10;
        //         sum += s*s;
        //         temp /= 10;
        //     }
        //     if(sum==1) return 1;
        //     temp=sum;
        // }
        // if(sum==7) return 1;
        // return 0;
         
         
         
         
         
        //  List<Integer> list = new ArrayList<>();
        // while(n!=1){
        //     int temp = n;
        //     n = 0;
        //     while(temp>0){
        //         n += Math.pow((temp%10),2);
        //         temp/=10;
        //     }
        //     if(list.contains(n)) return 0;
        //     else list.add(n);
        // }
        // return 1;
     }
}