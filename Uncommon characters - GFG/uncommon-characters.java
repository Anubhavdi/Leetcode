//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String A = sc.next();
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String UncommonChars(String A, String B)
    {
        // code here
        int freq[] = new int[26];
        for(int i=0;i<A.length();i++){
            freq[A.charAt(i)-'a'] = 1;
        }
        
        for(int i=0;i<B.length();i++){
            if(freq[B.charAt(i)-'a']==1 || freq[B.charAt(i)-'a']==-1){
                freq[B.charAt(i)-'a']=-1;
            }else{
                freq[B.charAt(i)-'a']=2;
            }
        }
        
        String str = "";
        for(int i=0;i<26;i++){
            if(freq[i]==1 || freq[i]==2){
                str+=(char)(i+'a');
            }   
        }
        return str.isEmpty()?"-1":str;
        
        
    }
}