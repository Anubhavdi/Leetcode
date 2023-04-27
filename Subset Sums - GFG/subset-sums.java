//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> list, int N){
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        generateSum(0,list,res,0);
        return res;
    }
    
    public void generateSum(int idx,ArrayList<Integer> list , ArrayList<Integer> res,int sum){
        res.add(sum);
        for(int i=idx;i<list.size();i++){
            sum += list.get(i);
            generateSum(i+1,list,res,sum);
            sum -= list.get(i);
        }
    }
}