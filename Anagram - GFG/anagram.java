//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
// } Driver Code Ends


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        int [] temp = new int[26];
        for(int i=0;i<a.length();i++){
            temp[a.charAt(i)-97] +=1;
        }
        for(int i=0;i<b.length();i++){
            temp[b.charAt(i)-97] -=1;
        }
        
        for(int i=0;i<temp.length;i++){
            if(temp[i]!=0) return false;
        }
        return true;
        
         
        
        // Your code here
        // char[] c1 = a.toCharArray();
        // char[] c2 = b.toCharArray();
        // Arrays.sort(c1);
        // Arrays.sort(c2);
        // String a1 = new String(c1);
        // String b1 = new String(c2);
        // return a1.equals(b1);
        
        
        // Map<Character,Integer> map = new HashMap<>();
        // Map<Character,Integer> map1 = new HashMap<>();
        
        
        // for(int i=0;i<a.length();i++){
        //     map.put(a.charAt(i),map.getOrDefault(a.charAt(i),0)+1);
        // }
        // for(int i=0;i<b.length();i++){
        //     map1.put(b.charAt(i),map1.getOrDefault(b.charAt(i),0)+1);
        // }
        
        // return map.equals(map1);
    }
    
}