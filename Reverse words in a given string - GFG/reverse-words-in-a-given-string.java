//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    
    static void reverse(char[] ch,int start,int end){
        while(start<=end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
    }
    String reverseWords(String s)
    {
        // code here 
        char [] str = s.toCharArray();
        
        int start = 0;
        for(int end = 0;end<str.length;end++){
            if(str[end]=='.'){
                //System.out.println(end);
                reverse(str,start,end-1);
                // for(int i=0;i<str.length;i++){
                //     System.out.print(str[i]+" ");
                // }
                // System.out.println();
                start = end+1;
            }
            
        }
        
        reverse(str,start,str.length-1);
       
        reverse(str,0,str.length-1);
        
        
        s = new String(str);
        return s;
        
    }
}