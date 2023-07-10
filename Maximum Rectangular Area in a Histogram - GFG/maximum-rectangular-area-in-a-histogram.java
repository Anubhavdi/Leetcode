//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    long n = Long.parseLong(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[(int)n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    System.out.println(new Solution().getMaxArea(arr, n));
		}
	}
}




// } Driver Code Ends


class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
        // your code here
        long[] NSR = nearestSmallRight(hist,n);
        long[] NSL = nearestSmallLeft(hist,n);
        
        
        
        
        long ans = 0;
        for(int i=0;i<n;i++){
            ans = Math.max((NSR[i]-NSL[i]-1)*hist[i],ans);
        }
        return ans;
    }
    public static long[] nearestSmallRight(long[] hist,long n){
        long[] ans = new long[(int)n];
        Stack<Integer> st = new Stack<>();
        for(int i=(int)n-1;i>=0;i--){
            while(!st.isEmpty() && hist[st.peek()]>= hist[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=(int)n;
            }else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    
     public static long[] nearestSmallLeft(long[] hist,long n){
        long[] ans = new long[(int)n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<(int)n;i++){
            while(!st.isEmpty() && hist[st.peek()]>= hist[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;
    }
        
}



