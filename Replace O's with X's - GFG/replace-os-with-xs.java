//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(a[0]);
            int m = Integer.parseInt(a[1]);
            char mat[][] = new char[n][m];
            for(int i=0; i<n; i++)
            {
                String S[] = in.readLine().trim().split(" ");
                for(int j=0; j<m; j++)
                {
                    mat[i][j] = S[j].charAt(0);
                }
            }
            
            Solution ob = new Solution();
            char[][] ans = ob.fill(n, m, mat);
            for(int i = 0;i < n;i++) {
                for(int j = 0;j < m;j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static void dfs(int r,int c,int[][]visi,char[][] mat,int[] delrow,int[] delcol){
        visi[r][c] = 1;
        int n = mat.length;
        int m = mat[0].length;
        for(int i=0;i<4;i++){
            int row = r+delrow[i];
            int col = c+delcol[i];
            
            if(row>=0 && row<n && col>=0 && col<m && visi[row][col]==0 && mat[row][col]=='O'){
                dfs(row,col,visi,mat,delrow,delcol);
            }
        }
    }
    
    static char[][] fill(int n, int m, char mat[][])
    {
        // code here
         int delrow[] = {-1,0,1,0};
         int delcol[] = {0,+1,0,-1};
         int[][] visi = new int[n][m];
         
         for(int j=0;j<m;j++){
             if(visi[0][j]==0 && mat[0][j]=='O'){
                 dfs(0,j,visi,mat,delrow,delcol);
             }
             if(visi[n-1][j]==0 && mat[n-1][j]=='O'){
                 dfs(n-1,j,visi,mat,delrow,delcol);
             }
         }
         
         for(int i=0;i<n;i++){
             if(visi[i][0]==0 && mat[i][0]=='O'){
                 dfs(i,0,visi,mat,delrow,delcol);
             }
             if(visi[i][m-1]==0 && mat[i][m-1]=='O'){
                 dfs(i,m-1,visi,mat,delrow,delcol);
             }
         }
         
         for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
                 if(visi[i][j]==0 && mat[i][j]=='O'){
                     mat[i][j] = 'X';
                 }
             }
         }
         return mat;
    }
}