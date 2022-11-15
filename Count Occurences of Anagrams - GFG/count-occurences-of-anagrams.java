//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String txt = br.readLine().trim();
            String pat = br.readLine().trim();

            int ans = new Solution().search(pat, txt);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    int search(String p, String s) {
        // code here
        //List<Integer> list = new ArrayList<>();
        int i=0,j=0;
        int k=p.length();
        int n = s.length();
        int ans =0;
        
        Map<Character,Integer> map = new HashMap<>();
        for(int a=0;a<k;a++){
            map.put(p.charAt(a),map.getOrDefault(p.charAt(a),0)+1);
        }
        int count=map.size();
        while(j<n){
            
            if(map.containsKey(s.charAt(j))){
                map.put(s.charAt(j),map.get(s.charAt(j))-1);
                if(map.get(s.charAt(j))==0){
                    count--;
                }
            }
            

            if(j-i+1<k){
                j++;
            }else if(j-i+1==k){
                
                if(count==0){
                    //list.add(i);
                    ans++;
                }
                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i),map.get(s.charAt(i))+1);
                    if(map.get(s.charAt(i))==1){
                        count++;
                    }
                }
                
                i++;
                j++;
            }
        }
        //System.out.print(ans);
        return ans;
    }
}