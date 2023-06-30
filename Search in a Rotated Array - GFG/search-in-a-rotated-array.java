//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0)
        {
            int n = Integer.parseInt(in.readLine().trim());
            int A[] = new int[n];
            String s[]=in.readLine().trim().split(" ");
            for (int i = 0;i < n;i++)
            {
                A[i] = Integer.parseInt(s[i]);
            }
            int key = Integer.parseInt(in.readLine().trim());
            
            out.println(new Solution().search(A, 0, n - 1, key));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int search(int arr[], int l, int h, int key)
    {
        // l: The starting index
        // h: The ending index, you have to search the key in this range
        // Complete this function
        
        int c = 0;
        while(l<=h){
            if(arr[l]>arr[h]){
                l++;
                c++;
            }else{
                h--;
            }
        }
        
        int f = Search(arr,c,arr.length-1,key);
        int s = Search(arr,0,c-1,key);
        
        if(f!=-1 ){
            return f;
        }
        if(s!=-1){
            return s;
        }
        return -1;
    }
    
    public int Search(int []arr,int low ,int high,int key){
        while(low<=high){
            int mid = (low+high)>>1;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]<key){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
}