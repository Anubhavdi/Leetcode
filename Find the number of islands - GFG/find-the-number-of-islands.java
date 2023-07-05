//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        // Code here
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visi = new boolean[m][n];
        int num_of_Islands = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visi[i][j] && grid[i][j]=='1'){
                    dfs(i,j,grid,visi);
                    num_of_Islands++;
                }
            }
        }
        return num_of_Islands;
    }
    
    public static void dfs(int r,int c , char[][] grid,boolean[][] visi){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || visi[r][c] || grid[r][c]=='0'){
            return;
        }
        
        visi[r][c] = true;
        dfs(r,c-1,grid,visi);
        dfs(r-1,c,grid,visi);
        dfs(r,c+1,grid,visi);
        dfs(r+1,c,grid,visi);
        dfs(r-1,c-1,grid,visi);
        dfs(r-1,c+1,grid,visi);
        dfs(r+1,c-1,grid,visi);
        dfs(r+1,c+1,grid,visi);
        
    }
}