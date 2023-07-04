//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		
		while(test > 0){
		    String s = scan.next();
		    String t = scan.next();
		    
		    System.out.println(new Solution().smallestWindow(s, t));
		    test--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p)
    {
        // Your code here
        
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<p.length();i++){
            map.put(p.charAt(i),map.getOrDefault(p.charAt(i),0)+1);
        }
        int i=0;
        int j = 0;
        int ans = Integer.MAX_VALUE;
        int temp = ans;
        int start= 0;
        int count = map.size();
        while(j<s.length()){
            
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0){
                    count--;
                }
            }
            
            if(count>0){
                j++;
            }else if(count==0){
                temp = ans;
                ans = Math.min(ans,j-i+1);
                if(temp!=ans){
                    start=i;
                }
                
                while(count==0){
                    if(map.containsKey(s.charAt(i))){
                        map.put(s.charAt(i),map.get(s.charAt(i))+1);
                        if(map.get(s.charAt(i))==1){
                            count++;
                        }
                    }
                    i++;
                    if(count==0){
                        ans= Math.min(ans,j-i+1);
                        if(temp!=ans){
                            start = i;
                        }
                    }
                }
                j++;
                
            }
        }
        
        if(ans==Integer.MAX_VALUE){
            return "-1";
        }
        return s.substring(start,start+ans);
    }
}